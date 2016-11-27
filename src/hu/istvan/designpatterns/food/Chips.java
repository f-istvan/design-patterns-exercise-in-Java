package hu.istvan.designpatterns.food;

public class Chips implements Food {

    @Override
    public double increaseHappiness(final double actualHappiness) {
	return actualHappiness * 1.05;
    }

}
