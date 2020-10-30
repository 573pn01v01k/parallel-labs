package ru.bmstu.parralel.lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class FlightMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    private static final int DEST_AIRPORT_ID = 14;
    private static final int ARRIVAL_DELAY = 18;

    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException{
        String fields[];
        int airportID;
        float arrivalDelay;

        if(key.get() == 0){
            return;
        }
        fields = value.toString().replace("\"", "").split(",");
        arrivalDelay = Float.parseFloat(fields[18]);
        if(!fields[ARRIVAL_DELAY].isEmpty()){
            arrivalDelay =
        }
    }
}
