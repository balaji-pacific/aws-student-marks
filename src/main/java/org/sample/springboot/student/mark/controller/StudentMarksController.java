/**
 * 
 */
package org.sample.springboot.student.mark.controller;

import java.util.ArrayList;
import java.util.List;

import org.sample.springboot.student.mark.pojo.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author balajisoundarrajan
 *
 */
@RestController
public class StudentMarksController {
	
	public static List<Student> students = new ArrayList<Student>();
	
	static {
		students.add(new Student("Balaji", 100, 90, 90, 90));
		students.add(new Student("Deepa", 101, 90, 90, 90));
		students.add(new Student("Yashika", 102, 100, 100, 100));
		students.add(new Student("Vasuki", 103, 100, 100, 100));
	}
	
	@GetMapping("/student-marks/id/{id}")
	public Student getStudentInfo(@PathVariable int id) {
		
		if(id>=100) {
			for(Student student: students) {
				if(student.getId() == id) {
					return student;
				}
			}
		}
		return new Student("Data Not Available",0,0,0,0);
	}
	
	@GetMapping("/")
	public String defaultPath() {
		return "Welcome to code pipeline";
	}

}
