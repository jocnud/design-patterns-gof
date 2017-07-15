# Template Design Pattern

### Making a hot beverage 
1. Coffee
2. Tea

#### Coffee Recipe
1. Boil Water
2. Brew coffee in boiling water
3. Pour into a cup
4. Add sugar and milk

#### Lemon Tea Recipe
1. Boil Water
2. Steep coffee in boiling water
3. Pour into a cup
4. Add lemon

----

Since we have two common methods `Boil Water` and `Pour into a cup` we can create a common class and those methods hem to it.

> We may want to abstract out the `prepareBeverage()` method too into the new common class, as both `Coffee` and `LemonTea` have to `prepareBeverage()` but have a slightly different ways to do it.
 

#### Is there anything else common in `Coffee` and `LemonTea`

We have extracted `boilWater()` and `pourInACup()` into the super class as their implementation would be the same. But if we look carefully we also had `prepareBeverage()` moved up into the super class but we had to keep it `abstract` as its implementation would be changed in both `Coffee` and `Leamon` 

#### Can we change the `prepareBeverage` ?

If we see in domain context `brewCoffee()` and `steepTea()` are similar former will brew coffee and latter will seat tea bag into boiling water. We can rename the method call inside `prepareBeverage()` to `brew()`
and similarly we can rename `addMilkAndSugar()` and `addLemon()` to `addCondiments()`. 

> Thus, having `prepareBeverage()` now behave as a concrete method independent of sub classes.
> `LemonTea` and `Coffee` can now get rid of `prepareBeverage()` and implement ``brew()`` and ``addCondiments()`` only.

 
 