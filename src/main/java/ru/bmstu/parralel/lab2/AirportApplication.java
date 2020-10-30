package ru.bmstu.parralel.lab2;

public class AirportApplication {
    public static void main(String[] args) throws Exception{
        if(args.length != 3){
            System.err.println("Use correct arguments");
            System.exit(-1);
        }
    }
}
