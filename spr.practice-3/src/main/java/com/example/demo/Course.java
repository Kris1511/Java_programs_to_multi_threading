package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {

	@Value("${name}")
	String name;
	
	@Value("${duration}")
	int duration;
	
	@Autowired
	Mentor mentor;
	
	public Course(String name, int duration, Mentor mentor) {
		super();
		this.name = name;
		this.duration = duration;
		this.mentor = mentor;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", mentor=" + mentor + "]";
	}
}
