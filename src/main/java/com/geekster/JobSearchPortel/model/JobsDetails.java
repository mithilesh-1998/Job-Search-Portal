package com.geekster.JobSearchPortel.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JOB-DETAILS")
public class JobsDetails {
    @Id
    private Integer id;
    //private Integer id;
    private String title;
    private String description;
    private String location;

    @Min(value = 20000)
    private Double salary; //(hint @min for salary : should be above 20,000 )

    @Email(message = "Given Mail is not valid.")
    private String companyEmail;

    @Column(unique = true)
    @NotBlank(message = "Company Name can't be blank.")
    private String companyName;
    @NotBlank(message = "Employer Name can't be blank.")
    private String employerName;
    @Enumerated(EnumType.STRING)
    private JobType jobType;
    private LocalDate appliedDate;
}
