package hu.istvan.designpatterns.food;

/**
 * An abstract class for extras like Ketchup and Mustard.
 */
public abstract class FoodExtra implements Food {

    public Food food;

    public FoodExtra(final Food food) {
	this.food = food;
    }
    
    @Override
    public abstract double increaseHappiness(final double actualHappiness);

    public Food getFood() {
        return food;
    }

    public void setFood(final Food food) {
        this.food = food;
    }
    
}
