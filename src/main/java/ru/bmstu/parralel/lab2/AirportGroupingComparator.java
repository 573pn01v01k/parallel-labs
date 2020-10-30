package ru.bmstu.parralel.lab2;


import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;

public class AirportGroupingComparator extends WritableComparator {
    AirportGroupingComparator(){
        super(AirportKey.class, true);
    }

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
        return ((AirportKey)a).getId().compareTo(((AirportKey)b.getId()));
    }
}
