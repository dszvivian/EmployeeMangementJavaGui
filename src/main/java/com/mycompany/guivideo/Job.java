package com.mycompany.guivideo;


import java.io.*;

/*Serialization is the process of 
turning an object in memory into a stream of bytes 
so you can do stuff like store it on disk or send it over the network.*/

public class Job implements Serializable {
    
    private double salary;
    private String typeOfJob;
    
    //checking equality
    public boolean equals(Job job){
        
        
        /*
        if(this.salary == job.salary && this.typeOfJob.equals(job.typeOfJob)){
            return true;
        }
        else{
            return false;
        }
        */
        
        return (this.salary == job.salary && this.typeOfJob.equals(job.typeOfJob));
    }

    
    //constructor
    public Job(double salary, String typeOfJob) {
        this.salary = salary;
        this.typeOfJob = typeOfJob;
    }
    
    //getter and setters for both variable
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getTypeOfJob() {
        return typeOfJob;
    }

    public void setTypeOfJob(String typeOfJob) {
        this.typeOfJob = typeOfJob;
    }
    
    
    
    
    
    
    
    
    
}
