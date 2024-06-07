<h1 align="center"><strong>Generics</strong></h1>

Java Generics enable types (classes and interfaces) to be parameters when defining classes, interfaces, and methods. They provide a way to create reusable code components that can operate on objects of various types while providing compile-time type safety. It can be used for creating generic classes, methods, interfaces and used in other cenarios. Below will be detailed some examples that I implemented in this project.

&nbsp;

## Classes

Classes that can operate on any specified type.

```java
class MyClass <T> {}

class MyClass <T extends SomeObject> {}

class MyClass <T extends SomeObject & Serializable> {}

class MyClass <A,B,C,D,E> {}
```

The Example01 and Example02 classes exemplify some of these cases.

&nbsp;

## Methods

Methods that can accept type parameters. The Example03 class exemplifies this implementation.

```java
public <T> void method(T t) {}

public <T extends SomeObject> void method(T t) {}

public <T extends SomeObject & Serializable> void method(T t) {}

public <A,B,C> void method(A a, B b, C c) {}

public <T> T method(T t) { return t; }
```

&nbsp;

## Other

It is also possible to implement generics in interfaces, as in the example below:

```java
public interface MyInterface<T> {}
```

Another common use of generics is in java collections. Collections like List, Map, and Set use generics to enforce type safety.

```java
List<String> stringList = new ArrayList<>();
stringList.add("Hello");
```

&nbsp;

## Summary

In summary, Java Generics enhance code flexibility, maintainability, and safety by allowing the definition of classes, methods, and interfaces that can operate on various types while ensuring type correctness at compile time.