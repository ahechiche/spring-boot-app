package com.example.postgresdemo.controller;

import com.example.postgresdemo.exception.ResourceNotFoundException;
import com.example.postgresdemo.model.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepController {

	@GetMapping("/")
    public String getRoot() {
    	return "Hi Alec it is the root";
    }
	
	@GetMapping("/hi")
    public String getHello() {
    	return "Hi Alec";
    }
	
    @GetMapping("/department")
    public List<Department> getAnswers() {
    	List<Department> list = new ArrayList<>();
    	Department dep1 = new Department();
    	dep1.setDeptId(10L);
    	dep1.setNameDpdt("Maths");
    	list.add(dep1);
    	dep1 = new Department();
    	dep1.setDeptId(20L);
    	dep1.setNameDpdt("Physics");
    	list.add(dep1);
    	return list;
    }

  

    

   
}
