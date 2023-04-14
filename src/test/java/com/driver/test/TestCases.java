package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
class A{
  public String a(){
  return "Invoking method from class A";
  }
}
class B extends A{
  public String a(){
  return "Method is overridden in Extendend class B";
  }
}
public class TestCases {
    B obj=new B();
    System.out.println(obj.a());
}
