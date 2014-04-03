/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 041401093
 */
public class PerDayRental {
    
    private double perDayKm;
    private final int CHARGE_RATE_DAY = 100;
    private double totalCost;
    private int daysRented;
    
    private Journey getKm;
    
    PerDayRental(int daysRented){
        perDayKm = getKm.getKilometers();
        daysRented =  this.daysRented;
    }
    
    double computeDays() {
        totalCost = CHARGE_RATE_DAY * daysRented;
        return totalCost;
    }
}
