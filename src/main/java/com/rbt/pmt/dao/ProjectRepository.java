package com.rbt.pmt.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.rbt.pmt.entities.Project;
public interface ProjectRepository extends CrudRepository<Project,Long> {
	@Override
	List<Project> findAll();
}
