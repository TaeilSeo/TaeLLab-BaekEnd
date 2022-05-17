package com.sti.taelab.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sti.taelab.dto.News;
import com.sti.taelab.service.NewsService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/news")
public class NewsController {

	private static final Logger logger = LoggerFactory.getLogger(NewsController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private NewsService newsService;
	
	@ApiOperation(value = "뉴스를 등록 날짜를 기준으로 내림차순하여 cnt 값만큼 반환", response = List.class)
	@GetMapping
	public ResponseEntity<List<News>> retrieveNews(@RequestParam Map<String, String> map) throws Exception {
		logger.debug("retrieveNews - 호출");
		logger.debug("map: " + map);
		
		String cnt = map.get("cnt");
		map.put("cnt", cnt != null ? cnt : "3");
		
		return new ResponseEntity<List<News>>(newsService.retrieveNews(map), HttpStatus.OK);
	}
}
