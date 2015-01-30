///////////////////
//Robert Salay
//Lab 02
//1/30/2015
//Cyclometer for a bicycle
/*
Print # of minutes for each trip
print # of counts for each trip
print distance of each trip in miles
print distance of combined trips*/

//create class
public class Cyclometer{
    
    public static void main(String[] args){
        //create variables to store the seconds for each trip, and the rotations for each trip
        int secsTrip1=480; //Seconds for 1st trip
        int secsTrip2=3220; //Seconds for 2nd trip
        int countsTrip1=1561; //Number of rotations; 1st trip
        int countsTrip2=9037; //Number of rotations; 2nd trip
        
        //create variables for constants
        double wheelDiameter=27.0, //Wheel diameter
        PI = 3.14159, //Pi
        feetPerMile=5280, //feet in a mile
        inchesPerFoot=12, //inches in a foot
        secondsPerMinute=60; //seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //creates distances for both trips, separate & combined
        System.out.println("Trip 1 took " + 
        (secsTrip1/secondsPerMinute) +" minutes and had " +
        countsTrip1+" counts.");
        System.out.println("Trip 2 took " + 
        (secsTrip2/secondsPerMinute) +" minutes and had " +
        countsTrip2+" counts.");
        
        //calculate and store the data for each trip's length
        //the wheel travels the diameter in inches times PI
        distanceTrip1=countsTrip1*wheelDiameter*PI; //distance1 in inches
        distanceTrip2=countsTrip2*wheelDiameter*PI; //distance2 in inches
        //adjust trip length to miles
        distanceTrip1/=inchesPerFoot*feetPerMile;
        distanceTrip2/=inchesPerFoot*feetPerMile;
        //calculate total distance
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Print out length data
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
    }
}