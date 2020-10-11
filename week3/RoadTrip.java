package week3;

/**
 *
 * @author Alyssa
 */
public class RoadTrip {
   public static void main(String[] args){
   
        String carMake = "1996 Mazda Protege";
        String carName = "NedFry";
        int maxPassengers = 5;
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double tripBudget = 300;
        double distanceToMoabUtah = 1080.0;
        boolean destinationReached = false;
        
        double legDistance;
        
        System.out.println("***ROAD TRIP SIMULATOR***");
        System.out.println("-->Beginning of trip stats<--");
        System.out.println("Make of car " + carMake + " that can carry: " + maxPassengers);
        System.out.println("The car's name is " + carName);
        System.out.println("Distance to destination: " + distanceToMoabUtah);
        System.out.println("Full car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend of this trip");
        System.out.println("Starting trip with " + currentNumberOfPassengers + " Passenger");
        System.out.println("Destination reached? " + destinationReached);
        
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
            System.out.println("CHECK LEG DISTANCE: " + legDistance);
            
        tripOdometer = tripOdometer + legDistance;
        
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
            System.out.println("Oh look! A person who wants to go West too!");
            
        if(carFull == false){
            System.out.println("Car is not full - picking up the hitchhiker!");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
        }
        
        double gasPriceForLeg = (legDistance / 35) * 1.99;
        tripBudget = tripBudget - gasPriceForLeg;
        
        System.out.println();
        System.out.println("***Variable stats at end of the leg 1***");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
        
        legDistance = 500.00;
        
        System.out.println("Two more hitchhikers!");
        if(carFull == false){
            System.out.println("Car isn't full yet - gonna pick up the hitchhikers!");
            currentNumberOfPassengers = currentNumberOfPassengers + 2;
        }
        gasPriceForLeg = (legDistance / 35) * 1.99;
        tripBudget = tripBudget - gasPriceForLeg;
        System.out.println("Amount spent on gas: " + gasPriceForLeg);
        
        
        System.out.println();
        System.out.println("***Variable stats at end of the leg 2***");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
        
        legDistance = distanceToMoabUtah - legDistance;
      
        System.out.println("Oh no, more hitchhikers!");
        
        int numHitchers = 2;
        if(currentNumberOfPassengers + numHitchers <= maxPassengers){
            System.out.println("Able to pick up freeloaders!");
            currentNumberOfPassengers = currentNumberOfPassengers + numHitchers;
        } else  {
            System.out.println("Car's full! Sorry!");
        }
        
       
        gasPriceForLeg = (legDistance / 35) * 1.99;
        tripBudget = tripBudget - gasPriceForLeg;
        System.out.println("Amount of gas paid on final leg: " + gasPriceForLeg);
        
        destinationReached = true;
        
        
        
        System.out.println();
        System.out.println("***Variable stats at end of the leg 3***");
        System.out.println("Distance To Destination: " + distanceToMoabUtah);
        System.out.println("Full Car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("I have $" + tripBudget + " to spend on this trip");
        System.out.println(currentNumberOfPassengers + " passengers in car");
        System.out.println("Destination Reached? " + destinationReached);
        
        
    } // close class main
} // close class RoadTrip
        
        
        
        
        

        
        
   
   
  