package com.gu.service.impl;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.gu.bean.Lesson;
import com.gu.dao.LessonMapper;
import com.gu.service.LessonService;

public class LessonServiceImpl implements LessonService{
	
	@Autowired LessonMapper lessonDao;
	
	private static final Logger runlog = LogManager.getLogger(LessonServiceImpl.class);
	@Override
	public List<Lesson> findAllLessons() throws Exception {
		runlog.debug("+++");
		return null;
	}
}
