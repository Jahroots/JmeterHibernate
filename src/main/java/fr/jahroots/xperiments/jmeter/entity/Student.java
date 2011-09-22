package fr.jahroots.xperiments.jmeter.entity;

public class Student implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String studentname;

	public Student() {
	}

	public Student(String studentname) {
		this.studentname = studentname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

}
