package com.gu.dao;

import java.util.List;

import com.gu.bean.Lesson;

public interface LessonMapper {

	/**
	 * 获取所有课程
	 * @return
	 * @throws Exception
	 */
	public List<Lesson> getAllLessons() throws Exception;
}
