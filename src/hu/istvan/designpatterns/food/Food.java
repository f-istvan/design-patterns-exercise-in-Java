package hu.istvan.designpatterns.food;

/**
 * Defines an interface for HotDog and Chips classes that can be decorated by Ketchup and/or Mustard classes.
 * Interface for Food objects the factory method creates.
 */
public interface Food {

    double increaseHappiness(final double actualHappiness);
    
}
