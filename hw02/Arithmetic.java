//////////////
//Robert Salay
//Homework 02
//1/31/2015
//Wal-mart shopping trip
// calculate the cost of the entire trip, including 6% sales tax

public class Arithmetic{
    
    public static void main(String[] args){
        //number of socks
        int nSocks=3;
        //cost per pair of socks
        double sockCost$=2.58;
        
        //# of glasses
        int nGlasses=6;
        //cost per glass
        double glassCost$=2.29;
        
        //# of boxes of envelopes
        int nEnvelopes=1;
        //cost per box
        double envelopeCost$=3.25;
        
        //tax
        double taxPercent=0.06;
        
        //create variables for each total cost
        double totalSockCost,
        totalGlassCost,
        totalEnvelopeCost,
        totalTotalCost;
        
        //Calculate costs
        totalSockCost = (sockCost$ * (1+taxPercent)) * nSocks;
        totalGlassCost= (glassCost$ * (1+taxPercent)) * nGlasses;
        totalEnvelopeCost= (envelopeCost$ * (1+taxPercent)) * nEnvelopes;
        totalTotalCost= totalSockCost + totalGlassCost + totalEnvelopeCost;
        
        System.out.println("The socks cost $" + totalSockCost);
        System.out.println("The glasses cost $" + totalGlassCost);
        System.out.println("The envelopes cost $" + totalEnvelopeCost);
        System.out.println("The whole tripe cost $" + totalTotalCost);
    }
}