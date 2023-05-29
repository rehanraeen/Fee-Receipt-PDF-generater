package com.bean;

public class FeeReceiptBean {
	private int reciptNo;
	private String studentName;
	private long mobileNo;
	private String date;
	private String course;
	private float courseFee;
	private float paidFee;
	private float balanceFee;

	public int getReciptNo() {
		return reciptNo;
	}

	public void setReciptNo(int reciptNo) {
		this.reciptNo = reciptNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {

		switch (course) {
		case "java":
			this.course = course;
			break;

		case "c++":
			this.course = course;
			break;

		default:
			System.out.println("Course Not Available");
		}

	}

	public float getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(float courseFee) {

		this.courseFee = courseFee;
	}

	public float getPaidFee() {
		return paidFee;
	}

	public void setPaidFee(float paidFee) {
		if (courseFee >= paidFee) {
			this.paidFee = paidFee;
		} else {
			System.out.println("Enter valid amount");
		}

	}

	public float getBalanceFee() {
		return balanceFee;
	}

	public void setBalanceFee(float balanceFee) {
		this.balanceFee = balanceFee;
	}

}
