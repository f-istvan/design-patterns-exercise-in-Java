package hu.istvan.designpatterns.tests;

import hu.istvan.designpatterns.enums.FoodExtraName;
import hu.istvan.designpatterns.enums.FoodName;
import hu.istvan.designpatterns.order.Order;
import hu.istvan.designpatterns.order.Order.OrderBuilder;

import org.junit.Test;

public class HotDogTest {

    TestUtil testUtil = new TestUtil();
    
    @Test
    public void hotDog() {
	Order order = new OrderBuilder(FoodName.HOT_DOG).build();
	testUtil.runTest(order, 1.0, 3.0);
    }
    
    @Test
    public void hotDogMustard() {
	Order order = new OrderBuilder(FoodName.HOT_DOG).addExtra(FoodExtraName.MUSTARD).build();
	testUtil.runTest(order, 1.0, 2.0);
    }
    
    @Test
    public void hotDogKetchup() {
	Order order = new OrderBuilder(FoodName.HOT_DOG).addExtra(FoodExtraName.KETCHUP).build();
	testUtil.runTest(order, 3.0, 7.0);
    }

    @Test
    public void hotDogMustardKetchup() {
	Order order = new OrderBuilder(FoodName.HOT_DOG).addExtra(FoodExtraName.MUSTARD).addExtra(FoodExtraName.KETCHUP).build();
	testUtil.runTest(order, 5.0, 7.0);
    }

    @Test
    public void hotDogKetchupMustard() {
	Order order = new OrderBuilder(FoodName.HOT_DOG).addExtra(FoodExtraName.KETCHUP).addExtra(FoodExtraName.MUSTARD).build();
	testUtil.runTest(order, 8.0, 9.0);
    }
    
}
