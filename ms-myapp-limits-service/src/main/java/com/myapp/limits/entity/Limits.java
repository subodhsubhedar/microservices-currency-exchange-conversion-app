package com.myapp.limits.entity;

public class Limits {

	private int maxLimit;
	private int minLimit;

	public Limits(int maxLimit, int minLimit) {
		super();
		this.maxLimit = maxLimit;
		this.minLimit = minLimit;
	}

	public int getMaxLimit() {
		return maxLimit;
	}

	public void setMaxLimit(int maxLimit) {
		this.maxLimit = maxLimit;
	}

	public int getMinLimit() {
		return minLimit;
	}

	public void setMinLimit(int minLimit) {
		this.minLimit = minLimit;
	}

}
