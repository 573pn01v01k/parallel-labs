package ru.bmstu.parralel.lab2;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Partitioner;

public class AirportPartitioner extends Partitioner<AirportKey, Text> {

    @Override
    public int getPartition(AirportKey airportKey, Text text, int i) {
        return ((Integer.hashCode(airportKey.airportID) & Integer.MAX_VALUE) )
    }
}
