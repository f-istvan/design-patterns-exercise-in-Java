package hu.istvan.designpatterns.factories;

import hu.istvan.designpatterns.enums.FoodName;
import hu.istvan.designpatterns.food.HotDog;

/**
 * Implementation of FoodCreator to produce HotDog.
 */
public class HotDogCreator extends FoodCreator {
    
    public HotDogCreator() {
	super(FoodName.HOT_DOG);
    }
    
    @Override
    public HotDog createFood() {
	return new HotDog();
    }
    
}
