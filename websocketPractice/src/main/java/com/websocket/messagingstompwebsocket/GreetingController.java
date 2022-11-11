package com.websocket.messagingstompwebsocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {


  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  public Greeting greeting(HelloMessage message) throws Exception {
    Thread.sleep(100); // simulated delay
    return new Greeting("Hellodasd, " + HtmlUtils.htmlEscape(message.getName()) + "! " + "Your text is :"    + HtmlUtils.htmlEscape(message.getText()));

  }

}