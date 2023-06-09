package top.lxyi.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@WebListener
public class CustomListener implements ServletContextListener, HttpSessionListener, ServletRequestListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        log.info("------------------" + "context 创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        log.info("------------------" + "context 销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        log.info("------------------" + "Request 销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("------------------" + "Request 创建");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        log.info("------------------" + "session 创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        log.info("------------------" + "session 销毁");
    }
}
