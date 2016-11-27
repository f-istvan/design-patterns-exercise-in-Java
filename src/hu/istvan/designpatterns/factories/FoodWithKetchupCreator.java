package hu.istvan.designpatterns.factories;

import hu.istvan.designpatterns.enums.FoodExtraName;
import hu.istvan.designpatterns.food.Food;
import hu.istvan.designpatterns.food.Ketchup;

/**
 * Implementation of FoodWithExtraCreator to produce FoodWithKetchup.
 */
public class FoodWithKetchupCreator extends FoodWithExtraCreator {

    public FoodWithKetchupCreator() {
	super(FoodExtraName.KETCHUP);
    }

    @Override
    public Ketchup createFood(final Food food) {
	return new Ketchup(food);
    }
    
}
