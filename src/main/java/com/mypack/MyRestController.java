package com.mypack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

	@Autowired
	ServiceProviderClass s;

	@GetMapping("/mydata")
	public List<PojoStudentClass> name() {
		return this.s.getAllData();
	}
	
	@GetMapping("getByID/{id}")
	public PojoStudentClass getStudentById(@PathVariable int id) {
		return this.s.getbyID(id);		
	}
	
	@RequestMapping(value = "updatedata",method = RequestMethod.PUT)
	public void updateData(@RequestBody PojoStudentClass p) {
		this.s.updatadataByid(p);
	}
	
	@RequestMapping(value = "insertdata",method=RequestMethod.POST)
	public void insertdata(@RequestBody PojoStudentClass p)
	{
		this.s.insertdata(p);
	}
	
	@RequestMapping(value = "/deleteByID/{id}",method = RequestMethod.DELETE)
	public void remomedata(@PathVariable int id)
	{
		this.s.deleteByID(id);
	}
	
	
	
}
