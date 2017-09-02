package com.gu.bean;

public class Lesson {
	private Integer id;
	private String name;
	private String teacher;
	private String data;
	private String time;
	private Integer limit;
	
	public Lesson() {
		super();
	}

	public Lesson(Integer id, String name, String teacher, String data, String time, Integer limit) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.data = data;
		this.time = time;
		this.limit = limit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "Lesson [id=" + id + ", name=" + name + ", teacher=" + teacher + ", data=" + data + ", time=" + time
				+ ", limit=" + limit + "]";
	}
	
	
	
}
