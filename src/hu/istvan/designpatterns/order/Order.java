package hu.istvan.designpatterns.order;

import hu.istvan.designpatterns.enums.FoodExtraName;
import hu.istvan.designpatterns.enums.FoodName;

import java.util.LinkedList;

/**
 * A class for objects that customers can order.
 */
public class Order {

    private FoodName foodName;
    private LinkedList<FoodExtraName> extrasNames = new LinkedList<FoodExtraName>();
    
    private Order(OrderBuilder orderBuilder) {
	this.foodName = orderBuilder.getFoodName();
	this.extrasNames = orderBuilder.getExtrasNames();
    }
    
    public boolean containsExtra() {
	return extrasNames.isEmpty();
    }
    
    public FoodName getFoodName() {
	return this.foodName;
    }
    
    public LinkedList<FoodExtraName> getExtrasNames() {
        return extrasNames;
    }

    /**
     * A builder class for creating Order objects.
     */
    public static class OrderBuilder {
	
	private FoodName foodName;
	private LinkedList<FoodExtraName> extrasNames = new LinkedList<FoodExtraName>();
	
	public OrderBuilder(FoodName foodName) {
	    this.foodName = foodName;
	}
	
	public OrderBuilder addExtra(final FoodExtraName foodExtraName) {
	    this.extrasNames.addLast(foodExtraName);
	    return this;
	}

	private FoodName getFoodName() {
	    return foodName;
	}

	private LinkedList<FoodExtraName> getExtrasNames() {
	    return extrasNames;
	}

	public Order build() {
	    return new Order(this);
	}
	
    }
    
}
