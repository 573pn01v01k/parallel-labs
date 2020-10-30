package ru.bmstu.parralel.lab2;

import org.apache.hadoop.io.WritableComparable;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class AirportKey implements WritableComparable<AirportKey>{
    Boolean indicator;
    int airportID;

    AirportKey() {}

    AirportKey(int airportID, Boolean indicator){
        this.indicator = indicator;
        this.airportID = airportID;
    }
    @Override
    public int compareTo(AirportKey o) {
        return ;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {

    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {

    }
} {

}
