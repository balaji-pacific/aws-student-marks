/**
 * 
 */
package org.sample.springboot.student.mark.pojo;

import java.math.BigDecimal;

/**
 * @author balajisoundarrajan
 *
 */
public class Student {

	private String name;
	private int id;
	private int math;
	private int language;
	private int science;
	private int total;
	private BigDecimal average;
	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Student(String name, int id, int math, int language, int science) {
		super();
		this.name = name;
		this.id = id;
		this.math = math;
		this.language = language;
		this.science = science;
	}



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
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language) {
		this.language = language;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public BigDecimal getAverage() {
		return average;
	}
	public void setAverage(BigDecimal average) {
		this.average = average;
	}
	
	

}
