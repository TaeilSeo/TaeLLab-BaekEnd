package com.sti.taelab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sti.taelab.dto.Stock;
import com.sti.taelab.mapper.StockMapper;

@Service
public class StockServiceImpl implements StockService {
	
	@Autowired
	private StockMapper stockMapper;

	@Override
	public List<Stock> retrieveStock() {
		return stockMapper.selectStock();
	}

}
