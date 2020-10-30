package ru.bmstu.parralel.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

import java.io.IOException;
import java.util.Iterator;


public class AirportReducer extends Reducer<AirportKey, Text, Text, Text> {
    @Override
    protected void reduce(AirportKey key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        Iterator<Text> iter = values.iterator();
        String airportName = iter.next().toString();
        float current = 0;
        float count = 0;
        float min = Float.MAX_VALUE;
        float max = 0;
        float avg = 0;

        if(!iter.hasNext()){
            return;
        }

        while(iter.hasNext()){
            current = Float.parseFloat(iter.next().toString());
            min = Math.min(min, current);
            max = Math.max(max, current);
            avg = (avg * count + current) / ++count;
        }

        String output = String.format("%s - min: %f, avg: %f, max: %f", airportName, min, avg, max);
        context.write(new Text(key.getId()), new Text(output))
    }
}
