package com.sti.taelab.service;

import java.util.List;
import java.util.Map;

import com.sti.taelab.dto.News;

public interface NewsService {
	public List<News> retrieveNews(Map<String, String> map);
}
