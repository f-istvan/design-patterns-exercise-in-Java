package hu.istvan.designpatterns.participants;

import hu.istvan.designpatterns.enums.FoodExtraName;
import hu.istvan.designpatterns.factories.ChipsCreator;
import hu.istvan.designpatterns.factories.FoodCreator;
import hu.istvan.designpatterns.factories.FoodWithExtraCreator;
import hu.istvan.designpatterns.factories.FoodWithKetchupCreator;
import hu.istvan.designpatterns.factories.FoodWithMustardCreator;
import hu.istvan.designpatterns.factories.HotDogCreator;
import hu.istvan.designpatterns.food.Food;
import hu.istvan.designpatterns.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    List<FoodCreator> foodCreators = new ArrayList<FoodCreator>();
    List<FoodWithExtraCreator> foodWithExtraCreators = new ArrayList<FoodWithExtraCreator>();
    
    public Waiter() {
	fillFoodCreators();
	fillFoodWithExtraCreators();
    }

    private void fillFoodCreators() {
	foodCreators.add(new HotDogCreator());
	foodCreators.add(new ChipsCreator());
    }
    
    private void fillFoodWithExtraCreators() {
	foodWithExtraCreators.add(new FoodWithMustardCreator());
	foodWithExtraCreators.add(new FoodWithKetchupCreator());	
    }

    public Food order(Order order) {
	Food food = createFoodByOrder(order);
	food = createFoodWithExtrasByOrder(order, food);
	return food;
    }

    protected Food createFoodWithExtrasByOrder(final Order order, final Food food) {
	Food foodWithExtra = food;
	if (!order.containsExtra()) {
	    for (FoodExtraName orderExtraName : order.getExtrasNames()) {
		for (FoodWithExtraCreator foodWithExtraCreator : foodWithExtraCreators) {
		    if (foodWithExtraCreator.getName().equals(orderExtraName)) {
			foodWithExtra = foodWithExtraCreator.createFood(foodWithExtra);
		    }
		}
	    }
	}
	return foodWithExtra;
    }

    protected Food createFoodByOrder(final Order order) {
	Food food = null;
	for (FoodCreator foodCreator : foodCreators) {
	   if (foodCreator.getName().equals(order.getFoodName())) {
		food = foodCreator.createFood();
	   }
	}
	return food;
    }

}
