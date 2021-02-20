package com.study.xinchao.remote;

import com.study.xinchao.common.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @description:
 * @author: Deng Qi Qua_n
 * @date: 2021/2/20 10:58
 */
@FeignClient(name = "xinchao-study")
public interface StudyFeignService {
    @GetMapping(value = "/test/one",consumes = MediaType.APPLICATION_JSON_VALUE)
    Result getTest();
}
