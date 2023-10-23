package com.geekster.JobSearchPortel.repository;

import com.geekster.JobSearchPortel.model.JobType;
import com.geekster.JobSearchPortel.model.JobsDetails;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobDetailsRepo extends CrudRepository<JobsDetails,Integer> {

    List<JobsDetails> findByJobType(JobType jobType);


    //custom Query
    @Query(value = "select * from JOB DETAILS where id = :id" , nativeQuery = true)
    JobsDetails getJobsById(Integer id);

}
