package com.study.xinchao.controller;


import com.study.xinchao.common.Result;
import com.study.xinchao.remote.StudyFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/2/19 11:03
 */
@RestController
@Slf4j
public class TestController {

    @Resource
    private StudyFeignService studyFeignService;

    @Value("${url.baidu}")
    private String baidu;

    @GetMapping("/test")
    public Result sentinelTest(){
        log.info("有服务来调我了-----------");
        return Result.success("鸭儿了----------success");
    }

    @GetMapping("/bai/du")
    public Result baiDu(){
        Result test = studyFeignService.getTest();
        return Result.success(baidu+"---"+test.getData());
    }
}
