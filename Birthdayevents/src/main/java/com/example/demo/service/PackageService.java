package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PackageEntity;
import com.example.demo.repository.PackageRepository;

@Service

public class PackageService {
	@Autowired
	PackageRepository sr;
	public PackageEntity saveinfo(PackageEntity ss)
	{
		return sr.save(ss);
	}
    public List<PackageEntity> savedetails(List<PackageEntity> ss)
    {
    	return (List<PackageEntity>)sr.saveAll(ss);
    }
	public List<PackageEntity> showinfo()
	{
		return sr.findAll();
	}
	public PackageEntity changeinfo(PackageEntity ss)
	{
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(PackageEntity ss)
	{
		sr.delete(ss);
	}

	

	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
}
