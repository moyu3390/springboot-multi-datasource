package com.example.demo.policestation.controller;

import com.example.demo.policestation.model.Oracle;
import com.example.demo.policestation.model.Mysql;
import com.example.demo.policestation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>多数据源配置</p>
 *
 * @author wangdejian
 * @since 2018/3/19
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "testOracle")
    public List<Oracle> testOracle() {
        return testService.findOracleList();
    }

    /**
     * 多数据源测试
     *
     * @return
     */
    @RequestMapping(value = "testMysql")
    public List<Mysql> testMysql() {
        return testService.findMysqlList();
    }

}