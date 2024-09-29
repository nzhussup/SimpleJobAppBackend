package com.nzhussup.jobappproject.controller;

import com.nzhussup.jobappproject.model.Job;
import com.nzhussup.jobappproject.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobControllerImpl implements JobController {

    @Autowired
    JobService jobService;
    @Autowired
    private Job job;

    @RequestMapping("/showJobs")
    @Override
    public String showJobs(Model model) {

        List<Job> jobs = jobService.getAllJobs();
        model.addAttribute("jobs", jobs);
        return "showall";
    }

    @RequestMapping("/addJob")
    @Override
    public String addJob(Job newJob, Model model) {

        jobService.addJob(newJob);
        model.addAttribute("addedJob", newJob);
        return "added";
    }

    @RequestMapping("/deleteJob")
    @Override
    public String deleteJob(int id, Model model) {

        Job job = jobService.getJobById(id);
        model.addAttribute("deletedJob", job);
        jobService.deleteJob(job);
        return "deleted";
    }
}
