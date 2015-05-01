package com.funayman.example.tests.exercises.chapter3;

public class Simple {

  private final String GREETING = "Hello,";
  private String name;

  public Simple(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String speak() {
    return String.format("%s %s", GREETING, getName());
  }
}
