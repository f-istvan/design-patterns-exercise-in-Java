package hu.istvan.designpatterns.factories;

import hu.istvan.designpatterns.enums.FoodName;
import hu.istvan.designpatterns.food.Chips;

/**
 * Implementation of FoodCreator to produce Chips.
 */
public class ChipsCreator extends FoodCreator {

    public ChipsCreator() {
	super(FoodName.CHIPS);
    }
    
    @Override
    public Chips createFood() {
	return new Chips();
    }

}
