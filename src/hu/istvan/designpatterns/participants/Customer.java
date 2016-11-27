package hu.istvan.designpatterns.participants;

import hu.istvan.designpatterns.food.Food;
import hu.istvan.designpatterns.order.Order;

public class Customer {

    private double happiness;
    private Waiter waiter;
    
    public Customer(double happiness, Waiter waiter) {
	this.happiness = happiness;
	this.waiter = waiter;
    }
    
    public void orderFromWaiter(Order order) {
	Food food = waiter.order(order);
	consume(food);
    }

    private void consume(Food food) {
	happiness = food.increaseHappiness(happiness);
    }
    
    public double getHappiness() {
	return this.happiness;
    }
    
}
