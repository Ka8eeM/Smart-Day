package com.example.karim.gproject.Models;

/**
 * Created by KARIM on 3/16/2018.
 */

public class ProjectModel {
    private String projectName;
    private String endDate;

    public ProjectModel(String pn, String ed) {
        this.projectName = pn;
        this.endDate = ed;
    }

    public String getProjectName()
    {
        return projectName;
    }
    public String getEndDate()
    {
        return endDate;
    }
}
