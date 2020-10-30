package ru.bmstu.parralel.lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class FlightMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    private static final int DEST_AIRPORT_ID = 14;
    private static final int ARIVAL_DELAY = 18;
    
}



