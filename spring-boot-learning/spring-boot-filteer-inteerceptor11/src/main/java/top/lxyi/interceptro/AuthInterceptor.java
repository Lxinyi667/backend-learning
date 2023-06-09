package top.lxyi.interceptro;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/***
 * @description:
 * @author: yk
 * @date:
 * @param:
 * @return:
 **/
@Component
@Slf4j
public class AuthInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //在请求处理之前进行权限校验
//        String token = request.getHeader("Authorization");
//        if (token != null){
//            if ("Admin123".equals(token)){
//                //权限校验通过，放行请求
//                return true;
//            }else {
//                //token 错误，校验失败，返回401错误码
//                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//                return false;
//            }
//        }else {
//            //token为空,返回401错误码
//            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
//            return false;
//        }
        return true;
    }
}
