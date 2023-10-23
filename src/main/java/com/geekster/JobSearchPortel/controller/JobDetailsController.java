package com.geekster.JobSearchPortel.controller;

import com.geekster.JobSearchPortel.model.JobType;
import com.geekster.JobSearchPortel.model.JobsDetails;
import com.geekster.JobSearchPortel.service.JobDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobDetailsController {

    @Autowired
    JobDetailsService jobDetailsService;

    //crud operations

    //read
    @GetMapping("jobs")
    public Iterable<JobsDetails> getAllJobs(){
        return jobDetailsService.getAllJobs();
    }

    @GetMapping("jobs/{id}")
    public JobsDetails getJobsById(@PathVariable Integer id){
        return jobDetailsService.getJobsById(id);

    }
    //create
    @PostMapping("job")
    public void addJob(@RequestBody JobsDetails jobsDetails){
        jobDetailsService.addJob(jobsDetails);
    }

    //create a list of jobs
    @PostMapping("jobs")
    public String addJobs(@RequestBody List<JobsDetails> jobsDetailsList){
        return jobDetailsService.addJobs(jobsDetailsList);
    }

    //delete
    @DeleteMapping("job/{id}")
    public String deleteJobs(@PathVariable Integer id){
        return jobDetailsService.deleteJobs(id);
    }

    //update
    @PutMapping("job/{id}/{type}")
    public String updateJobById(@PathVariable Integer id , @PathVariable JobType jobType){
        return jobDetailsService.updateJobById(id,jobType);
    }


//    //Custom Finder

    @GetMapping("jobs/type/{type}")
    public List<JobsDetails> getJobsByType(@PathVariable JobType type){

        return jobDetailsService.getJobsByType(type);
    }

}
