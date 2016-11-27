package hu.istvan.designpatterns.food;

public class Mustard extends FoodExtra {

    public Mustard(Food food) {
	super(food);
    }

    @Override
    public double increaseHappiness(final double actualHappiness) {
	return actualHappiness + 1;
    }

}
