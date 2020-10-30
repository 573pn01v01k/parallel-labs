package ru.bmstu.parralel.lab2;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.yarn.webapp.hamlet.Hamlet;

import java.io.IOException;

public class AirportMapper extends Mapper<LongWritable, Text, AirportKey, Text> {
    private static final int DEST_AIRPORT_ID = 14;
    private static final int ARRIVAL_DELAY = 18;

    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String fields[];
        int airportID;
        float arrivalDelay;

        if (key.get() == 0) {
            return;
        }
        arrivalDelay = 0;
        fields = value.toString().replace("\"", "").split(",");
        if (!fields[ARRIVAL_DELAY].isEmpty()) {
            arrivalDelay = Float.parseFloat(fields[ARRIVAL_DELAY]);
        }
        if(arrivalDelay > 0){
            airportID = Integer.parseInt(fields[DEST_AIRPORT_ID]);
            context.write(new AirportKey(airportID, false), new Text(Float.toString(arrivalDelay)));
        }
    }
}
