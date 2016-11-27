package hu.istvan.designpatterns.tests;

import hu.istvan.designpatterns.enums.FoodExtraName;
import hu.istvan.designpatterns.enums.FoodName;
import hu.istvan.designpatterns.order.Order;
import hu.istvan.designpatterns.order.Order.OrderBuilder;

import org.junit.Test;

public class ChipsTest {

    TestUtil testUtil = new TestUtil();
    
    @Test
    public void chips() {
	Order order = new OrderBuilder(FoodName.CHIPS).build();
	testUtil.runTest(order, 10.0, 10.5);
    }
    
    @Test
    public void chipsMustard() {
	Order order = new OrderBuilder(FoodName.CHIPS).addExtra(FoodExtraName.MUSTARD).build();
	testUtil.runTest(order, 1.0, 2.0);
    }
    
    @Test
    public void chipsKetchup() {
	Order order = new OrderBuilder(FoodName.CHIPS).addExtra(FoodExtraName.KETCHUP).build();
	testUtil.runTest(order, 5.0, 5.5);
    }
    
   @Test
   public void chipsMustardKetchup() {
	Order order = new OrderBuilder(FoodName.CHIPS).addExtra(FoodExtraName.MUSTARD).addExtra(FoodExtraName.KETCHUP).build();
	testUtil.runTest(order, 5.0, 7.0);
   }
   
   @Test
   public void chipsKetchupMustard() {
	Order order = new OrderBuilder(FoodName.CHIPS).addExtra(FoodExtraName.KETCHUP).addExtra(FoodExtraName.MUSTARD).build();
	testUtil.runTest(order, 5.0, 6.0);
   }
   
}
