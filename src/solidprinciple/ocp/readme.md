**Open/Closed Principle (OCP)**
A class should be open for extension but closed for modification.

>You should **extend** functionality using **inheritance or polymorphism** instead of modifying existing code.

**Problem:** If we add a new type (**PLATINUM**), we must modify the class, violating OCP.


✅ Benefits:

>Easy to add new discounts **without modifying existing code.**

>**Reduces bugs and improves maintainability.**