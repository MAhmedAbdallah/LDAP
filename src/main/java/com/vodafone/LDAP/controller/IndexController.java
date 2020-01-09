/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vodafone.LDAP.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 3amerjr
 */
@RequestMapping("/")
@Controller
public class IndexController {

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String getIndex() {
      
        return "index";
    }
    @RequestMapping(value = "home" , method = RequestMethod.POST)
    public String getHome(){
          Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName(); //get logged in username
        System.out.println(name);
        return "home";
    }
}
