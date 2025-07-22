package com.miscellaneous.geeks.sorting;

public class Interval {

	private Integer start;
	private Integer end;
	
	public Interval(Integer start,Integer end) {
		this.start = start;
		this.end = end;
	}

	public Integer getStart() {
		return start;
	}

	public Integer getEnd() {
		return end;
	}
	
	public void setStart(Integer start) {
		this.start = start;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "[" + start + ", " + end + "]";
	}
	
}
