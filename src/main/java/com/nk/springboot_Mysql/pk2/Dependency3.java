package com.nk.springboot_Mysql.pk2;

import com.nk.springboot_Mysql.pk1.Dependency2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("bean3")
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
