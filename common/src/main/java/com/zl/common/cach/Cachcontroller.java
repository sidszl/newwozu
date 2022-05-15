package com.zl.common.cach;

import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/cache/vi")
public class Cachcontroller {
    @Resource
    private RedisCach redisCach;


    @PostMapping("/add")
    public boolean addCach(@RequestParam String key){
     return   redisCach.set("zhangsan",1000);
    }

    @PostMapping("/get")
    public String getCach(@RequestParam String key){
        return   redisCach.get("zhangsan").toString();
    }
}
