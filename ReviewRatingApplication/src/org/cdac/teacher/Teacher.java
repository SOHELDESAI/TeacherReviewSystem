package org.cdac.teacher;

import java.util.ArrayList;

public class Teacher {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList getRating() {
		return rating;
	}

	public void setRating(ArrayList rating) {
		this.rating = rating;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public ArrayList getTextreview() {
		return textreview;
	}

	public void setTextreview(ArrayList textreview) {
		this.textreview = textreview;
	}

	private ArrayList rating;
	private int count;
	private ArrayList textreview;
}
