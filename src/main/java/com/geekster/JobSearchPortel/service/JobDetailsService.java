package com.geekster.JobSearchPortel.service;

import com.geekster.JobSearchPortel.model.JobType;
import com.geekster.JobSearchPortel.model.JobsDetails;
import com.geekster.JobSearchPortel.repository.IJobDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobDetailsService {

    @Autowired
    IJobDetailsRepo iJobDetailsRepo;

    public  Iterable<JobsDetails> getAllJobs() {
        return (Iterable<JobsDetails>) iJobDetailsRepo.findAll();
    }

    public void addJob(JobsDetails jobsDetails) {
        iJobDetailsRepo.save(jobsDetails);
    }

    public String addJobs(List<JobsDetails> jobsDetailsList) {
        iJobDetailsRepo.saveAll(jobsDetailsList);
        return "Job details Added";
    }

    public String deleteJobs(Integer id) {
        iJobDetailsRepo.deleteById(id);
        return "Job Details Deleted";
    }

    public String updateJobById(Integer id, JobType jobType) {
        Optional<JobsDetails> myJob = iJobDetailsRepo.findById(id);
        JobsDetails job = null;
        if(myJob.isPresent()){
            job=myJob.get();
        }else{
            return "ID not found";
        }
        job.setJobType(jobType);
        iJobDetailsRepo.save(job);
        return "job type updated";
    }


    public List<JobsDetails> getJobsByType(JobType type) {
        return iJobDetailsRepo.findByJobType(type);
    }


    public JobsDetails getJobsById(Integer id) {

        return iJobDetailsRepo.getJobsById(id);
    }
}
