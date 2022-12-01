package com.dmitriev.controller;

import com.dmitriev.model.Project;
import com.dmitriev.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class ProjectController {
    private final ProjectService projectService;
    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }
    @GetMapping("/projects")
    public List<Project> showAllProjects() {
        List<Project> allProjects = projectService.getProjects();
        return allProjects;
    }
    @GetMapping("/projects/{id}")
    public Project getProject(@PathVariable int id) {
        Project project = projectService.getProject(id);
        return project;
    }
    @PostMapping("/projects")
    public Project addNewProject(@RequestBody Project project) {
        projectService.saveProject(project);
        return project;
    }
    @PutMapping("/projects")
    public Project updateProject(@RequestBody Project project) {
        projectService.saveProject(project);
        return project;
    }
    @DeleteMapping("/projects/{id}")
    public String deleteProject(@PathVariable int id) {
        projectService.deleteProject(id);
        return "Project with id = " + id + " was deleted";
    }
}
