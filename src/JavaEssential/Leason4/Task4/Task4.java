package JavaEssential.Leason4.Task4;

public class Task4 {


//    https://docs.oracle.com/javase/tutorial/java/IandI/abstract.html

/**
 Abstract Methods and Classes

 An abstract class is a class that is declared abstract—it may or may not include abstract methods.
 Abstract classes cannot be instantiated, but they can be subclassed.

 An abstract method is a method that is declared without an implementation (without braces, and followed by a semicolon), like this:

 abstract void moveTo(double deltaX, double deltaY);


 When an Abstract Class Implements an Interface

 In the section on Interfaces, it was noted that a class that implements an interface must implement all of the interface's methods.
 It is possible, however, to define a class that does not implement all of the interface's
 methods, provided that the class is declared to be abstract. For example,

 Class Members
 An abstract class may have static fields and static methods.
 You can use these static members with a class reference (for example, AbstractClass.staticMethod())
 as you would with any other class.

 -----------------------------------------------------------------------------------------------------------------------
 Абстрактні класи це так само як і звичайні класи але з без можливості строрення його реалізації
 Абстрактні класи по сутні є описовими класами в яких можна описати
 - Поля
 - Методи:
 Які поділяються на : 1. Абстрактні тобто такі що не містять реалізації;
 2. Реальні тобто такі що в своєму тілі {} вде містять свою реалізацію;

 Основною необхідністю даних класів є успадковування їх звитайними класами в яких є Обовязкова необхідність
 їх перевизнаннчення - тобто реалізації через перевизначення мастрактних методів.

 Імплементація інтерфейсів в Абстрактні класи.

 У випадку коли абстрактний клас імплементує інтермейс то реалізація методів з інтерфейсу не реалізується в
 абстрактонму класі тому що не є необхідним їх реалізація в описовому класі.
 Таким чином :

 Конкретний клас - Абстрактний клас - Інтерфейс
 Абстрактний клас імплементує Інтерфейс - але не реалізує їх.
 Конкретний клас що успадковує Абстрактний клас та реалізує методи яке із Абстрактного класу та Інтерфейсу.

 -----------------------------------------------------------------------------------------------------------------------


 Interfaces
 There are a number of situations in software engineering when it is important for disparate groups of programmers
 to agree to a "contract" that spells out how their software interacts.
 Each group should be able to write their code without any knowledge of how the other group's code is written.
 Generally speaking, interfaces are such contracts.


 Interfaces in Java
 In the Java programming language, an interface is a reference type, similar to a class,
 that can contain only constants, method signatures, default methods, static methods,
 and nested types. Method bodies exist only for default methods and static methods.
 Interfaces cannot be instantiated—they can only be implemented by classes or extended by other interfaces.
 Extension is discussed later in this lesson.

 -----------------------------------------------------------------------------------------------------------------------

 interface - ключове слово що оголошує класу Java що він є Інтерфейсом.

 Інтерфейс - спеціальний клас який має в собі методи без реалізації тобто без тіла {} і успадковується
 основним класом Java за допомогою ключового слова implements.
 Інтерфейси зтворюються для створення повністю абстрактних класів тобто таких що немають в собі реалізації.

 Основою є те що множинна імплементація інтерфейсів дозволяєтьсяна противагу успадкування класів.
 В інтерфейсах вказуються Імена методів , списки аргументів та типи значень що їх повертають:
 void SomeMethod(int value , double value);
 БУДЬ-ЯКА ЗМІННА ЩО ОГОЛОШЕНА В ІНТЕРФЕЙСІ НЕЯВНО ОГОЛОШУЄТЬСЯ ЯК final та static ТА ЦЯ ЗМІННА МАЄ БУТИ ІНІЦІАЛІЗОВАНА.
 ЗМІНИТИ АБО ПЕРЕВИЗНАЧИТИ ЗМІННУ ПІСЛЯ ІМПЛЕМЕНТАЦІЇ ЇЇ В КОНКРЕТНИЙ КЛАС НЕМОЖЛИВО.
 Поля та методи за своєю сигнатурою являються статичними та публчними.
 * Інтерфейси фактично оголошують протокол взаємодії маж класами.
 * Дозволяють чітко розділити загальнодоступні методи від їх реалізації;
 * Ізолюють оголошення одного або декількох методів від ієрархіїуспадковування.
 * Будь-який метод що використовує інтерфейс знає лише тільки про ті методи інтерфейсу що будуть реалізовані.
 * Правильне об'єднання конкретних класів та інтерфейсів є ефективним у випадку реалізації різних патернів проектування.

 **/
}
