package ru.bmstu.parralel.lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    private static final int DEST_AIRPORT_ID = 14;
    private static final int ARIVAL_DELAY = 18;

    protected void map(LongWritable key, Text value, Context context) throws IOException
}
