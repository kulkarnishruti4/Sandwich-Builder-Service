---
title: Builder
category: Creational

---

## Intent

Separate the construction of a complex object from its representation so that the same construction process can create different representations.

## Explanation

Real-world example

> Imagine a character generator for a role-playing game. The easiest option is to let the computer create the character for you. If you want to manually select the character details like profession, gender, hair color, etc. the character generation becomes a step-by-step process that completes when all the selections are ready.

In plain words

> Allows you to create different flavors of an object while avoiding constructor pollution. Useful when there could be several flavors of an object. Or when there are a lot of steps involved in creation of an object.

Wikipedia says

> The builder pattern is an object creation software design pattern with the intentions of finding a solution to the telescoping constructor antipattern.

Having said that let me add a bit about what telescoping constructor antipattern is. At one point or the other, we have all seen a constructor like below:

```java
public Hero(Profession profession,String name,HairType hairType,HairColor hairColor,Armor armor,Weapon weapon){
        }
```

As you can see the number of constructor parameters can quickly get out of hand, and it may become difficult to understand the arrangement of parameters. Plus this parameter list could keep on growing if you would want to add more options in the future. This is called telescoping constructor antipattern.

## Applicability

Use the Builder pattern when

* The algorithm for creating a complex object should be independent of the parts that make up the object and how they're assembled
* The construction process must allow different representations for the object that's constructed
* It's particularly useful when a product requires a lot of steps to be created and when these steps need to be executed in a specific sequence

## Known Uses

* Java.lang.StringBuilder
* Java.nio.ByteBuffer as well as similar buffers such as FloatBuffer, IntBuffer, and others
* javax.swing.GroupLayout.Group#addComponent()

## Consequences

Benefits:

* More control over the construction process compared to other creational patterns
* Supports constructing objects step-by-step, defer construction steps or run steps recursively
* Can construct objects that require a complex assembly of sub-objects. The final product is detached from the parts that make it up, as well as their assembly process
* Single Responsibility Principle. You can isolate complex construction code from the business logic of the product

Trade-offs:

* The overall complexity of the code can increase since the pattern requires creating multiple new classes

## Tutorials

* [Refactoring Guru](https://refactoring.guru/design-patterns/builder)
* [Oracle Blog](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java)
* [Journal Dev](https://www.journaldev.com/1425/builder-design-pattern-in-java)

## Known uses

* [java.lang.StringBuilder](http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html)
* [java.nio.ByteBuffer](http://docs.oracle.com/javase/8/docs/api/java/nio/ByteBuffer.html#put-byte-) as well as similar buffers such as FloatBuffer, IntBuffer and so on.
* [java.lang.StringBuffer](http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-)
* All implementations of [java.lang.Appendable](http://docs.oracle.com/javase/8/docs/api/java/lang/Appendable.html)
* [Apache Camel builders](https://github.com/apache/camel/tree/0e195428ee04531be27a0b659005e3aa8d159d23/camel-core/src/main/java/org/apache/camel/builder)
* [Apache Commons Option.Builder](https://commons.apache.org/proper/commons-cli/apidocs/org/apache/commons/cli/Option.Builder.html)

## Related patterns

* [Step Builder](https://java-design-patterns.com/patterns/step-builder/) is a variation of the Builder pattern that generates a complex object using a step-by-step approach. The Step Builder pattern is a good choice when you need to build an object with a large number of optional parameters, and you want to avoid the telescoping constructor antipattern.

## Credits

* [Design Patterns: Elements of Reusable Object-Oriented Software](https://www.amazon.com/gp/product/0201633612/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=0201633612&linkCode=as2&tag=javadesignpat-20&linkId=675d49790ce11db99d90bde47f1aeb59)
* [Effective Java](https://www.amazon.com/gp/product/0134685997/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=0134685997&linkCode=as2&tag=javadesignpat-20&linkId=4e349f4b3ff8c50123f8147c828e53eb)
* [Head First Design Patterns: A Brain-Friendly Guide](https://www.amazon.com/gp/product/0596007124/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=0596007124&linkCode=as2&tag=javadesignpat-20&linkId=6b8b6eea86021af6c8e3cd3fc382cb5b)
* [Refactoring to Patterns](https://www.amazon.com/gp/product/0321213351/ref=as_li_tl?ie=UTF8&camp=1789&creative=9325&creativeASIN=0321213351&linkCode=as2&tag=javadesignpat-20&linkId=2a76fcb387234bc71b1c61150b3cc3a7)