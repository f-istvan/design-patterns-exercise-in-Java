package hu.istvan.designpatterns.food;

public class Ketchup extends FoodExtra {

    private static final int KETCHUP_INCREASE_EFFECT = 2;
    
    public Ketchup(Food food) {
	super(food);
    }
    
    @Override
    public double increaseHappiness(final double actualHappiness) {
	double productEffect = (food.increaseHappiness(actualHappiness) - actualHappiness);
	double productsEffectDoubled = productEffect * KETCHUP_INCREASE_EFFECT;
	return actualHappiness + productsEffectDoubled;
    }

}
