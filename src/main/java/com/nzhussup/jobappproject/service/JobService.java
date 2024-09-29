package com.nzhussup.jobappproject.service;

import com.nzhussup.jobappproject.model.Job;
import com.nzhussup.jobappproject.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {

    @Autowired
    JobRepo jobRepo;

    public void addJob(Job job) {
        jobRepo.save(job);
    }

    public List<Job> getAllJobs() {
        return jobRepo.findAll();
    }

    public Job getJobById(int id) {
        return jobRepo.findById(id);
    }

    public void deleteJob(Job job) {
        jobRepo.delete(job);
    }
}
