package com.forest10.spring.boot.family.controller;

import com.forest10.spring.boot.family.repository.ReadingListRepository;
import com.forest10.spring.boot.family.service.RedisTemplateExample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 描述:
 * 书籍阅读 Controller
 *
 * @author Forest10
 * @date 2018/04/01 16:12
 */
@RestController
@RequestMapping("/redisTest")
public class CommonController {

    @Resource
    private RedisTemplateExample redisTemplateExample;
    @Resource
    private ReadingListRepository readingListRepository;

    @GetMapping(value = "/listOp")
    public void getAllBooks(String userId, String url) {
        redisTemplateExample.addLink(userId, url);
    }

    @GetMapping(value = "/transaction")
    public void transaction(Boolean throwEx) {
        redisTemplateExample.transaction(throwEx);
    }

    @GetMapping(value = "/testEnableTx")
    public void testEnableTx(Boolean throwEx) {
        redisTemplateExample.addBook(throwEx);
    }

}