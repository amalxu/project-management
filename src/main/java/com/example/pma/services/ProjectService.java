package com.example.pma.services;

import com.example.pma.models.Project;
import com.example.pma.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(Long id, Project project) {
        Project existingProject = projectRepository.findById(id).orElse(null);
        if (existingProject != null) {
            // Update all fields of existingProject using values from the provided project object
            existingProject.setName(project.getName());
            existingProject.setDescription(project.getDescription());
    
            return projectRepository.save(existingProject);  // Save the modified existingProject
        }
        return null; // Or throw exception
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}
