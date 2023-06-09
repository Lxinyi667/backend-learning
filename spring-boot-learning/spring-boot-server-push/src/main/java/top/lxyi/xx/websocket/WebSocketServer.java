package top.lxyi.xx.websocket;

import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

//SpringBoot 服务端 webSocket 服务类定义
@Component
//表示websocket的接口服务地址
@ServerEndpoint(value = "/socket/{id}")
@Slf4j
public class WebSocketServer {
    //静态变量，用来统计在线连接数
    private static int onlineCount =0;
    //与某个客户端连续的会话，存放了和客户端连接对应的WebSocket对象
    private Session session;
    private Integer id;
    //concurrent包：线程安全的集合，用来存放和每个客户端对应的WebSocket对象
    public static ConcurrentHashMap<Integer,WebSocketServer> map = new ConcurrentHashMap<>();


    /**
     *     为连接建立成功时调用的方法
     */
    @OnOpen
    public void onOpen(@PathParam(value ="id")Integer id, Session session){
        log.info("连接成功");

        //接收到编号
        this.id=id;
        this.session = session;
        //加入集合
        map.put(id,this);//整个WebSocket对象
        //在线人数+1
        addOnlineCount();
        log.info("有新连接加入，当前在线人数为："+getOnlineCount());
        sendMessage("--连接已经成功建立--");
    }

    /**
     * 为连接关闭调用的方法
     */
    @OnClose
    public void onClose(){
        log.info("有连接关闭，当前在线人数为："+getOnlineCount());
        //从map移除
        map.remove(this.id);
        //在线人数-1
        subOnlineCount();
    }

    /**
     * 为收到客户端发送的消息后，调用的方法
     */
    @OnMessage
    public void onMessage(Session session,String msg){
        log.info("接收到客户端发送的消息："+msg);
        this.broadcastMsg(msg);
    }

    /**
     * 出现错误
     * @param error
     */
    @OnError
    public void onError(Throwable error){
        log.error(error.getMessage());
        error.printStackTrace();
    }
/**
 *    用来发送消息
 *    每次浏览器刷新，session会发生改变
  */

    private void sendMessage(String msg){
        try {
            getSession().getBasicRemote().sendText(msg);
        } catch (IOException e) {
            log.error("发生错误");
        }
    }
    /**
     * 指定SessionId发送消息
     */

    private void sendMessageById(Integer id,String msg){
        WebSocketServer webSocketServer = map.get(id);
        if (webSocketServer != null){
            webSocketServer.sendMessage(msg);
        }else {
            log.info("客户端已下线，不能发送信息");
        }
    }

    /**
     * 群发自定义消息
     * @return
     */
    private void broadcastMsg(String msg){
        for (WebSocketServer item : map.values()){
            item.sendMessage(msg);
        }
    }
    public Session getSession(){
        return session;
    }
//    通过 synchronized 给方法加锁，实现线程安全
    public static synchronized void addOnlineCount(){
        WebSocketServer.onlineCount++;
    }
    public static synchronized void subOnlineCount(){
        WebSocketServer.onlineCount--;
    }
    public static synchronized int  getOnlineCount(){
        return WebSocketServer.onlineCount;
    }
}
