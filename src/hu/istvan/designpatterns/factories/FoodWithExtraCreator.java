package hu.istvan.designpatterns.factories;

import hu.istvan.designpatterns.enums.FoodExtraName;
import hu.istvan.designpatterns.food.Food;

/**
 * Defines an abstract class for creating different types of FoodExtras. Declares the factory method createFood(Food food).
 */
public abstract class FoodWithExtraCreator {
    
    private FoodExtraName name;
    
    public FoodWithExtraCreator(final FoodExtraName name) {
	this.name = name;
    }

    public FoodExtraName getName() {
        return name;
    }

    public abstract Food createFood(final Food food);
    
}
