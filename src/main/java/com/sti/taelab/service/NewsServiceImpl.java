package com.sti.taelab.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sti.taelab.dto.News;
import com.sti.taelab.mapper.NewsMapper;

@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	private NewsMapper newsMapper;

	@Override
	public List<News> retrieveNews(Map<String, String> map) {
		Map<String, Object> param = new HashMap<String, Object>();
		int cnt = Integer.parseInt(map.get("cnt"));
		param.put("cnt", cnt);
		
		return newsMapper.selectNews(param);
	}
}
