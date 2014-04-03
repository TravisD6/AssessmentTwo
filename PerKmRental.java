/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 041401093
 */
public class PerKmRental {
    //Declaring variables
    private double ratePerKm = 1;
    private double km;
    private double totalCost;
    //Declaring object
    private Journey gettingKm;    
    //Getting the number of kmfrom journey
    PerKmRental () {
        km = gettingKm.getKilometers();
    }
    //Method that computes the total cost
    double computeKm(){
        totalCost = km * ratePerKm;
        return totalCost;
    }
}
