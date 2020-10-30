package ru.bmstu.parralel.lab2;

import org.apache.hadoop.mapreduce.*;

public class AirportApplication {
    public static void main(String[] args) throws Exception{
        if(args.length != 3){
            System.err.println("Use correct arguments");
            System.exit(-1);
        }
        Job job = Job.getInstance();
        job.setJarByClass(AirportApplication.class);
        job.setJobName("AirportApplication");
        

    }
}
