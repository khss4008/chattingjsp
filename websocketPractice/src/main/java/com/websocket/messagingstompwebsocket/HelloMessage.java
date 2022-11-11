package com.websocket.messagingstompwebsocket;

public class HelloMessage {

  private String name;
  private String text;
  
  public HelloMessage() {
  
  }

  public String getText() {
	return text;
}

public void setText(String text) {
	this.text = text;
}

public HelloMessage(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}