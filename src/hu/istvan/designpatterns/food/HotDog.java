package hu.istvan.designpatterns.food;

public class HotDog implements Food {

    private static final int HOT_DOG_INCREASE_VALUE = 2;
    
    @Override
    public double increaseHappiness(final double actualHappiness) {
	return actualHappiness + HOT_DOG_INCREASE_VALUE;
    }

}
