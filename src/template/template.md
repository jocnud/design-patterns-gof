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
 

 