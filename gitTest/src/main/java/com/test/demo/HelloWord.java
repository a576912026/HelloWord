package com.test.demo;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:wanghe
 * @title:com.test.demo
 * @Data:2018/12/17
 * @Time:19:37
 * @Description:TODO
 */
public class HelloWord {

    @Test
    public void test() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        System.out.println(sdf.format(new Date()));
    }

    @Test
    public void test02() {
        for (int i = 0; i < 10; i++) {
            System.out.println("helloword");
        }
    }

}
