package com.nzhussup.jobappproject.controller;

import com.nzhussup.jobappproject.model.Job;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public interface JobController {
    @RequestMapping("/showJobs")
    String showJobs(Model model);

    @RequestMapping("/addJob")
    String addJob(Job job, Model model);

    @RequestMapping("/deleteJob")
    String deleteJob(int id, Model model);
}
