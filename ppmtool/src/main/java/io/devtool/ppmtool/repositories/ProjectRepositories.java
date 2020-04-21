package io.devtool.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.devtool.ppmtool.domain.Project;

@Repository
public interface ProjectRepositories extends CrudRepository<Project, Long> {


	@Override
	Iterable<Project> findAllById(Iterable<Long> iterable);
	
}

