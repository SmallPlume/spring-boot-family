package com.forest10.spring.boot.family.controller;

import com.forest10.spring.boot.family.api.pojo.JsonResult;
import com.forest10.spring.boot.family.domain.Book;
import com.forest10.spring.boot.family.repository.ReadingListRepository;
import com.forest10.spring.boot.family.selfantion.RequestLimitRate;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 描述:
 * 书籍阅读 Controller
 *
 * @author Forest10
 * @date 2018/04/01 16:12
 */
@RestController
public class ReadingListController {

	@Autowired
	private ReadingListRepository readingListRepository;


	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public JsonResult addBook(@RequestBody Book book) {
		return JsonResult.success("添加成功", readingListRepository.save(book));
	}

	@GetMapping(value = "/getList")
	public JsonResult getList() {
		return JsonResult.success("获取列表成功", readingListRepository.findAll());
	}


}