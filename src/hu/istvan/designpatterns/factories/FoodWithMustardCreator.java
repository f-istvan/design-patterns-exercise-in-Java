package hu.istvan.designpatterns.factories;

import hu.istvan.designpatterns.enums.FoodExtraName;
import hu.istvan.designpatterns.food.Food;
import hu.istvan.designpatterns.food.Mustard;

/**
 * Implementation of FoodWithExtraCreator to produce FoodWithMustard.
 */
public class FoodWithMustardCreator extends FoodWithExtraCreator {

    public FoodWithMustardCreator() {
	super(FoodExtraName.MUSTARD);
    }

    @Override
    public Mustard createFood(final Food food) {
	return new Mustard(food);
    }

}
