package com.sti.taelab.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sti.taelab.dto.Stock;
import com.sti.taelab.service.StockService;

import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/stock")
public class StockController {
	
	private static final Logger logger = LoggerFactory.getLogger(StockController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";
	
	@Autowired
	private StockService stockService;
	
	@ApiOperation(value = "모든 주식 종목의 정보를 반환한다.", response = Stock.class)
	@GetMapping
	public ResponseEntity<List<Stock>> retrieveStock() throws Exception {
		logger.debug("retrieveStock - 호출");
		return new ResponseEntity<List<Stock>>(stockService.retrieveStock(), HttpStatus.OK);
	}
}
