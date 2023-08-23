package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PackageEntity;
import com.example.demo.service.PackageService;

@RestController

public class PackageController {
	@Autowired
	PackageService sser;
	@PostMapping("addpackage")
	public PackageEntity addndetails(@RequestBody PackageEntity ss)
	{
		return sser.saveinfo(ss);
		
		
	}
	@PostMapping("addnpackage")
	public List<PackageEntity> addndetails(@RequestBody List<PackageEntity> ss)
	{
		return sser.savedetails(ss);
		
		
	}
	@GetMapping("showpackage")
	public List<PackageEntity> show()
	{
		return sser.showinfo();
	}
	@PutMapping("updatepackage")
	public PackageEntity modify(@RequestBody PackageEntity ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletepackage")
	public String del(@RequestBody PackageEntity ss)
	{
		sser.deleteinfo(ss);
		return"deleted successfully";
	}
	
	@DeleteMapping("delparamidse")
	public void my(@RequestParam int id)
	{
		sser.deletepid(id);
		
	}
		
	


	

}
