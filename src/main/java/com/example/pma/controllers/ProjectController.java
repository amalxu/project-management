package com.example.pma.controllers;

import com.example.pma.models.Project;
import com.example.pma.services.ProjectService; // Use proper casing for ProjectService

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// @SpringBootApplication

@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService; // Use proper casing for ProjectService

    @Autowired
    public ProjectController(ProjectService projectService) { // Use proper casing for ProjectService
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }


    @GetMapping("/{id}")
    public Project getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    // @PostMapping
    // public Project createProject(@RequestBody Project project) {
    //     return projectService.createProject(project);
    // }
    @PostMapping
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        Project savedProject = projectService.createProject(project);
        return new ResponseEntity<>(savedProject, HttpStatus.CREATED); // Return the saved project with CREATED status code
    }

    @PutMapping("/{id}")
    public Project updateProject(@PathVariable Long id, @RequestBody Project project) {
        return projectService.updateProject(id, project);
    }

    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }
}
