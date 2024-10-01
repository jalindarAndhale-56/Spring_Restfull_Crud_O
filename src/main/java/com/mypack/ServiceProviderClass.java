package com.mypack;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceProviderClass {

	List<PojoStudentClass> list = new ArrayList<>();

	public ServiceProviderClass() {
		list.add(new PojoStudentClass(1, "A", 444.44, "aa"));
		list.add(new PojoStudentClass(2, "B", 565.0, "bb"));
		list.add(new PojoStudentClass(3, "C", 787.0, "cc"));
		list.add(new PojoStudentClass(4, "D", 656.0, "dd"));
	}

	public List<PojoStudentClass> getAllData() {
		return list;
	}

	public void insertdata(PojoStudentClass p) {
		list.add(p);
	}
	
	public PojoStudentClass getbyID(int id) {
		for (PojoStudentClass p : list) {
			if (p.getId()==id) {
				return p;
			}
		}
		return null;
	}

public void deleteByID(int id) {
		
		for (PojoStudentClass p : list) {
			if (p.getId()==id) {
				list.remove(id);
			}
		}		
	}

	public void updatadataByid(PojoStudentClass p) {
		
		for (PojoStudentClass p1 : list) {
			if (p1.getId()==p.getId()) {
				
				p1.setName(p.getName());
				p1.setSalary(p.getSalary());
				p1.setGrade(p.getGrade());
				
			}
		}
	}

	
}
