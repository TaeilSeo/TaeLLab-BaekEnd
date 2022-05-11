package com.sti.taelab.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sti.taelab.dto.Stock;

@Mapper
public interface StockMapper {
	public List<Stock> selectStock();
}
