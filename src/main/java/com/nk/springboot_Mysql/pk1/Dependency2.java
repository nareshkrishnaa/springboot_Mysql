package com.nk.springboot_Mysql.pk1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dependency2 {
    @Autowired
    private Dependency1 dependency1;
}
