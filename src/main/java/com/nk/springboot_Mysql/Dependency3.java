package com.nk.springboot_Mysql;

import com.sun.security.jgss.GSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dependency3 {
   private Dependency2 d2;

   @Autowired
    public Dependency3(Dependency2 d2) {
    this.d2 =d2;
    }

    public void show(){
        System.out.println("Show method of Dependency3 class called");
    }
}
