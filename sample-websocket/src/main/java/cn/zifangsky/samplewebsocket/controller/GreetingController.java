package cn.zifangsky.samplewebsocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Greeting
 * @author zifangsky
 * @date 2018/9/30
 * @since 1.0.0
 */
@Controller
public class GreetingController {

    // 浏览器访问：http://localhost:7000/reverse-show , 然后在浏览器console里看服务端推送的结果
    @RequestMapping("/reverse_show")
    public ModelAndView reverse_show(){
        return new ModelAndView("websocket/reverse");
    }

    // 浏览器访问：http://localhost:7000/echo_show
    @RequestMapping("/echo_show")
    public ModelAndView echo_show(){
        return new ModelAndView("websocket/echo");
    }

    @RequestMapping("/echo_sockjs_show")
    public ModelAndView echoSockJS_show(){
        return new ModelAndView("websocket/echo_sockjs");
    }

}
