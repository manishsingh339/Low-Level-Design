**Liskov Substitution Principle (LSP)**
Derived (child) classes must be substitutable for their base (parent) class.

> A subclass **must not** change the behavior of its superclass.

**Problem:** Calling fly() on a Penguin will break functionality.

✅ Benefits:

>Prevents **unexpected behavior** in subclasses.

>Promotes **proper use of polymorphism**.
