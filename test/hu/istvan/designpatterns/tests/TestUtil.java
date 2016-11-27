package hu.istvan.designpatterns.tests;

import static org.junit.Assert.assertEquals;
import hu.istvan.designpatterns.order.Order;
import hu.istvan.designpatterns.participants.Customer;
import hu.istvan.designpatterns.participants.Waiter;

public class TestUtil {

    private Waiter waiter = new Waiter();
    
    public void runTest(Order order, double happinessInitValue, double exceptedValue) {
	Customer customer = new Customer(happinessInitValue, waiter);
	customer.orderFromWaiter(order);
	assertEquals(exceptedValue, customer.getHappiness(), 0.0);
    }
	
}
