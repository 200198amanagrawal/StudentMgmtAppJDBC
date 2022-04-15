package com.student.manage;

public class Student {
	private int m_StudentID;
	private String m_StudentName;
	private String m_StudentCity;
	private String m_StudentPhone;
	
	public Student(String studentName, String studentCity, String studentPhone) {
		super();
		this.m_StudentName = studentName;
		this.m_StudentCity = studentCity;
		this.m_StudentPhone = studentPhone;
	}

	public Student(int studentID, String studentName, String studentCity, String studentPhone) {
		super();
		this.m_StudentID = studentID;
		this.m_StudentName = studentName;
		this.m_StudentCity = studentCity;
		this.m_StudentPhone = studentPhone;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [m_StudentID=" + m_StudentID + ", m_StudentName=" + m_StudentName + ", m_StudentCity="
				+ m_StudentCity + ", m_StudentPhone=" + m_StudentPhone + "]";
	}

	public int getStudentID() {
		return m_StudentID;
	}

	public void setStudentID(int studentID) {
		this.m_StudentID = studentID;
	}

	public String getStudentName() {
		return m_StudentName;
	}

	public void setStudentName(String studentName) {
		this.m_StudentName = studentName;
	}

	public String getStudentCity() {
		return m_StudentCity;
	}

	public void setStudentCity(String studentCity) {
		this.m_StudentCity = studentCity;
	}

	public String getStudentPhone() {
		return m_StudentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.m_StudentPhone = studentPhone;
	}
	
	
}
