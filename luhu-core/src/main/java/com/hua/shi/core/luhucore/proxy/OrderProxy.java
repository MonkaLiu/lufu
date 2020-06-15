package com.hua.shi.core.luhucore.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "micro-order")
public interface OrderProxy {

  @RequestMapping("/order/getOrderNo")
   String  getOderNo(String param);

}
