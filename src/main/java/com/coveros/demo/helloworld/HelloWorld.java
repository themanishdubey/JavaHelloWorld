package com.coveros.demo.helloworld;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HW {

  public static void main(final String[] args) {
    final DateTimeFormatter d = DateTimeFormatter.ofPattern("h:mm:ss a 'on' MMMM d, yyyy'.'");
    final LocalDateTime now = LocalDateTime.now();

    //Some wrong comment.
    System.out.println("Hello, World!! The current time is " + d.format(now));
  }
  
  public static void a() {
    int x = 5;
    int y = 3;
    System.out.println(x + y);
  }
//c
}
