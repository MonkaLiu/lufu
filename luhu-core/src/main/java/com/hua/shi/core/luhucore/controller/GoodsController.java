package com.hua.shi.core.luhucore.controller;

import com.hua.shi.core.luhucore.proxy.OrderProxy;
import com.hua.shi.core.luhucore.service.AccoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/goods")
public class GoodsController {

   @Autowired
   private AccoutService accoutService;

   @Autowired
   private OrderProxy orderProxy;


   @RequestMapping("/getAccount")
   public String testConfigServer(HttpServletRequest request){
       accoutService.queryList();
      String result = orderProxy.getOderNo("123456");
       return result ;
   }


}
