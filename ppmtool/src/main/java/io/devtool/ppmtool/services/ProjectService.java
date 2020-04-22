package io.devtool.ppmtool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.devtool.ppmtool.domain.Project;
import io.devtool.ppmtool.repositories.ProjectRepositories;

@Service
public class ProjectService {
	
	
	@Autowired
	private ProjectRepositories projectRepositories;
	
	
	public Project saveOrUpdateProject(Project project) {
		
		return projectRepositories.save(project);
		
	}

}
