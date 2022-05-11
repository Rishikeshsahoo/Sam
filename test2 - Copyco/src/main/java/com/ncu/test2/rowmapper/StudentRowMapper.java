package com.ncu.test2.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ncu.test2.Enitiy.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStudentId(rs.getInt("id"));
		student.setStudentName(rs.getString("name"));
		student.setStudentAddress(rs.getString("address"));
		return student;
	}
	
}
