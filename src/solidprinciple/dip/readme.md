**Dependency Inversion Principle (DIP)** 

High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces).

>**Avoid direct dependency** on concrete classes.

>Use **interfaces or abstract classes** to achieve loose coupling.

**Problem:** Computer depends directly on WiredKeyboard, making it hard to switch to a wireless keyboard.

✅ **Benefits:**

*Easier to switch implementations* (Wired/Wireless).
*Improves testability* using dependency injection.