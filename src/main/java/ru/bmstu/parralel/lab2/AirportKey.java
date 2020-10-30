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
        if(airportID == o.airportID) {
            return indicator ? -1 : 1;
        }
        return airportID - o.airportID;
    }

    @Override
    public void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(airportID);
        dataOutput.writeBoolean(indicator);
    }

    @Override
    public void readFields(DataInput dataInput) throws IOException {
        airportID = dataInput.readInt();
        indicator = dataInput.readBoolean();
    }
    public Integer getId(){
        return airportID;
    }
}

