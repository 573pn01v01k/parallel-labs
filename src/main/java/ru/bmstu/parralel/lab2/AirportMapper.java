package ru.bmstu.parralel.lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    private static final int AIRPORT_CODE = 0;
    private static final int AIRPORT_NAME = 1;

    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String strings[];
        String airportName;
        int airportCode;

        if (key.get() == 0) {
            return;
        }
        strings = value.toString().replace("\"", "").split(",", 2);
        airportCode = Integer.parseInt(strings[AIRPORT_CODE]);
        airportName = strings[AIRPORT_NAME];
        context.write(new AirportKey(airportCode, true), new Text(Float.toString(arrivalDelay)));
    }
}
