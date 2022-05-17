package com.sti.taelab.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sti.taelab.dto.News;

@Mapper
public interface NewsMapper {
	public List<News> selectNews(Map<String, Object> map);
}
