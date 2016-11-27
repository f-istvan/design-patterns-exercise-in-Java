Fast Food Restaurant
====================

Used design patterns:
* Decorator pattern
* Factory method pattern
* Builder pattern

Simulate the workflow of a restaurant
-------------------------------------

**Workflow:**

* Client orders a product
* The orders are prepared by a robot one after another (FIFO)
* The client receives and consumes the products

**Products:**

* The restaurant sells hot dogs and chips
* Extras for the products: ketchup, mustard
* Hot dog increases client happiness by 2
* Chips increases client happiness by 5%
* Ketchup doubles the effect of a product
* Mustard increases client happiness by 1 and removes the effect of the product
* We will introduce new products and extras (with different effects) in the near future

**Other informations:**

We don’t expect other changes in the future

Used design patterns
-------------------

**Decorator pattern**

*Food* defines an interface for *HotDog* and *Chips* classes that can be decorated by *Ketchup* and/or *Mustard* classes.
*FoodExtra* is an abstract class for extras like *Ketchup* and *Mustard*.

**Factory method pattern**

*FoodCreator* defines an abstract class for creating different types of Food. It declares the factory method *createFood()*.
*HotDogCreator* and *ChipsCreator* are implementations of *FoodCreator* so they can produce *HotDog* and *Chips*.
Class *Food* defines the interface of objects the factory method creates.

Factory method pattern is also used to create *Ketchup* and *Mustard*. Their common abstract class is *FoodWithExtraCreator*. 

**Builder pattern**

Builder pattern is used for creating Order objects.
Class *OrderBuilder* is a builder class for creating Order objects.
