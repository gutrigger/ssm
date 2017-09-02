package com.gu.service;

import java.util.List;

import com.gu.bean.Lesson;

public interface LessonService {
	/**
	 * 获取所有课程
	 * @return
	 * @throws Exception
	 */
	public List<Lesson> findAllLessons() throws Exception;
}
