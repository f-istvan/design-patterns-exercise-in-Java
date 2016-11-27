package hu.istvan.designpatterns.factories;

import hu.istvan.designpatterns.enums.FoodName;
import hu.istvan.designpatterns.food.Food;

/**
 * Defines an abstract class for creating different types of Food. Declares the factory method createFood().
 */
public abstract class FoodCreator {

    private FoodName name;
    
    public FoodCreator(final FoodName name) {
	this.name = name;
    }

    public FoodName getName() {
        return name;
    }
    
    public abstract Food createFood();
    
}
