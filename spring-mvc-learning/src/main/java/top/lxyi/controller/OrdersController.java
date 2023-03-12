package top.lxyi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.lxyi.entity.Orders;
import top.lxyi.entity.User;
//import top.lxyi.entity.User;

@Controller
public class OrdersController {
@RequestMapping("/toFindOrdersWithUser")
    public String toFindOrdersWithUser(){
    return "orders";
}
@RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders){
    Integer orderId = orders.getOrdersId();
    User user=orders.getUser();
    String username=user.getUsername();
    System.out.println("orderId="+orderId);
    System.out.println("username="+username);
    return "success";
}
}
