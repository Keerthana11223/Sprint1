package com.tns.studentProcess;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class StudentService {
	
		
			@Autowired
			private StudentRepository repo;
			
			public void save(Student stud)
			{
				repo.save(stud);
			}
			
			
			public List<Student> getAllStudent()
			{
				return repo.findAll();
			}
			
			public Student getStudentById(Integer id) 
			{
				return repo.findById(id).orElse(null);
			}
			
			public void deleteStudent(Integer id)
			{
				repo.deleteById(id);
			}

			public void updateStudent(Integer id , Student updatedStudent)
			{
				Student existingStudent = repo.findById(id).orElse(null);
				if (existingStudent != null)
				{
					existingStudent.setFirstName(updatedStudent.getFirstName());
					existingStudent.setLastName(updatedStudent.getLastName());
					existingStudent.setAddress(updatedStudent.getAddress());
					existingStudent.setContactNo(updatedStudent.getContactNo());
					existingStudent.setEmailId(updatedStudent.getEmailId());
					existingStudent.setDepartment(updatedStudent.getDepartment());
					repo.save(existingStudent);
				}
			}

	
}
