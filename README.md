# DesignPattern
# 设计模式（参考《Head First 设计模式》）

设计模式（Design Pattern）是一套被反复使用、多数人知晓的、经过分类的、代码设计经验的总结。
	使用设计模式的目的：为了代码可重用性、让代码更容易被他人理解、保证代码可靠性。 设计模式使代码编写真正工程化；设计模式是软件工程的基石脉络，如同大厦的结构一样。

## 1.  设计模式的分类

总体来说设计模式分为三大类：

创建型模式：对象实例化的模式，创建型模式解耦了对象的实例化过程。一共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。

结构型模式：把类或对象结合在一起形成更大的结构，一共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。

行为型模式：类和对象如何交互，及划分责任和算法，一共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

其实还有两类：并发型模式和线程池模式。

## 2.  设计模式的六大原则

### 总原则：开闭原则（Open Close Principle）

开闭原则就是说**对扩展开放，对修改关闭**。在程序需要进行拓展的时候，不能去修改原有的代码，而是要扩展原有代码，实现一个热插拔的效果。所以一句话概括就是：为了使程序的扩展性好，易于维护和升级。想要达到这样的效果，我们需要使用接口和抽象类等。

 实际上，绝对封闭的系统是不存在的。无论模块是怎么封闭，到最后，总还是有一些无法封闭的变化。而我们的思路就是：既然不能做到完全封闭，那我们就应该对那些变化封闭，那些变化隔离做出选择。我们做出选择，然后将那些无法封闭的变化抽象出来，进行隔离，允许扩展，尽可能的减少系统的开发。当系统变化来临时，我们要及时的做出反应。

 我们并不害怕改变的到来。当变化到来时，我们首先需要做的不是修改代码，而是尽可能的将变化抽象出来进行隔离，然后进行扩展。面对需求的变化，对程序的修改应该是尽可能通过添加代码来实现，而不是通过修改代码来实现。

实际上，变化或者可能的变化来的越早，抽象就越容易，相对的，代码的维护也就越容易；而当项目接近于完成而来的需求变化，则会使抽象变得很困难——这个困难，并不是抽象本身的困难，抽象本身并没有困难，困难在于系统的架构已经完成，修改牵扯的方面太多而使得抽象工作变得很困难。

### 2.1  单一职责原则

不要存在多于一个导致类变更的原因，也就是说每个类应该实现单一的职责，如若不然，就应该把类拆分。 

### 2.2  里氏替换原则（Liskov Substitution Principle）

里氏代换原则(Liskov Substitution Principle LSP)面向对象设计的基本原则之一，他是设计整个继承体系的原则。 里氏代换原则中说，任何基类可以出现的地方，子类一定可以出现。 LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。—— From Baidu 百科

里氏替换原则中，子类对父类的方法尽量不要重写和重载。因为父类代表了定义好的结构，通过这个规范的接口与外界交互，子类不应该随便破坏它。换句话说就是所有引用基类的地方必须能透明地使用其子类对象，使用子类替换基类的时候功能不会发生变化；子类在扩展父类功能时不能破坏父类原有的功能；

使用继承时，遵循里氏替换原则：

- 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
- 当子类重载父类方法时，方法的形参要比父类方法的参数更宽松
- 当子类实现父类的抽象方法时，方法的返回值要比父类更严格

### 2.3  依赖倒置原则（Dependence Inversion Principle）

这个是开闭原则的基础，具体内容：面向接口编程，依赖于抽象而不依赖于具体。写代码时用到具体类时，不与具体类交互，而与具体类的上层接口交互。要依赖于抽象，不要依赖于具体；高层模块不应该依赖低层模块，二者都应该依赖其抽象；抽象不应该依赖具体，具体应该依赖抽象；针对接口编程，不要针对实现编程。在java中，抽象指的是接口或者抽象类，具体就是具体的实现类。工厂方法模式，模板方法模式，迭代器模式都用到了依赖倒置原则。 

### 2.4  接口隔离原则（Interface Segregation Principle）

这个原则的意思是：每个接口中不存在子类用不到却必须实现的方法，如果不然，就要将接口拆分。使用多个隔离的接口，比使用单个接口（多个接口方法集合到一个的接口）要好。 

### 2.5  迪米特法则（最少知识原则）（Demeter Principle）

就是说：一个类对自己依赖的类知道的越少越好。也就是说无论被依赖的类多么复杂，都应该将逻辑封装在方法的内部，通过public方法提供给外部。这样当被依赖的类变化时，才能最小的影响该类。

最少知识原则的另一个表达方式是：只与直接的朋友通信。类之间只要有耦合关系，就叫朋友关系。耦合分为依赖、关联、聚合、组合等。我们称出现为成员变量、方法参数、方法返回值中的类为直接朋友。局部变量、临时变量则不是直接的朋友。我们要求陌生的类不要作为局部变量出现在类中。成员变量、方法参数、方法返回值中需要的类为直接朋友。类与类之间的关系越密切了解越多，耦合度越大。

外观模式和中介者模式都用到了最少知识原则。

### 2.6  合成复用原则（Composite Reuse Principle）

原则是尽量首先使用合成/聚合的方式，而不是使用继承。就是找到变化部分，抽象，封装变化。

## 3.  具体设计模式

### 3.1 工厂模式

简单工厂：一个工厂类根据传入的参量决定创建出哪一种产品类的实例

工厂方法：定义一个创建对象的接口，让子类决定实例化哪一个类

抽象工厂：创建相关或依赖对象的家族，而无需明确指定具体类

[工厂模式](https://songwell1024.github.io/2018/10/07/factory/)

### 3.2 单例模式

单例模式：某个类只能有一个实例，提供一个全局访问点

[单例模式](https://songwell1024.github.io/2018/10/07/singleton/)

### 3.3生成器模式

生成器模式：封装一个复杂对象的构建过程，并可以按步骤构造

[生成器模式](https://songwell1024.github.io/2018/10/17/BuilderPattern/)

### 3.4原型模式

原型模式：通过复制现有的实例来创建新的实例

[原型模式](https://songwell1024.github.io/2018/10/18/PrototypePattern/)

### 3.5适配器模式

适配器模式：将一个类的方法接口转换成客户希望的另外一个接口

[适配器模式](https://songwell1024.github.io/2018/10/17/AdapterMode/)

### 3.6组合模式

组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构

[组合模式](https://songwell1024.github.io/2018/10/17/CompositeMode/)

### 3.7装饰者模式

装饰者模式：动态地给对象添加新的功能

[装饰者模式](https://songwell1024.github.io/2018/10/07/decorator/)

### 3.8代理模式

代理模式：为其他对象提供一个代理以控制对这个对象的访问

[代理模式](https://songwell1024.github.io/2018/10/18/ProxyMode/)

### 3.9享元模式

享元模式：通过共享技术有效地支持大量细粒度的对象

[享元模式](https://songwell1024.github.io/2018/10/18/FlyweightPattern/)

### 3.10外观模式

外观模式：提供统一的方法来访问子系统的一群接口

[外观模式](https://songwell1024.github.io/2018/10/17/FacadeMode/)

### 3.11桥接模式

桥接模式：将抽象部分与它的实现部分分离，使它们都可以独立地变化

[桥接模式](https://songwell1024.github.io/2018/10/17/BridgeMode/)

### 3.12模板模式

模板模式：定义一个算法结构，而将一些步骤延迟到子类中实现

[模板模式](https://songwell1024.github.io/2018/10/18/TemplateMethod/)

### 3.13解释器模式

解释器模式：给定一个语言， 定义它的文法的一种表示，并定义一个解释器

[解释器模式](https://songwell1024.github.io/2018/10/18/InterpreterPattern/)

### 3.14策略模式

策略模式：定义一系列的算法，把它们封装起来， 并且使它们可相互替换

[策略模式](https://songwell1024.github.io/2018/10/07/strategy/)

### 3.15状态模式

状态模式：允许一个对象在其内部状态改变时改变它的行为

[状态模式](https://songwell1024.github.io/2018/10/18/StateMode/)

### 3.16 观察者模式

观察者模式：对象间的一对多的依赖关系

[观察者模式](https://songwell1024.github.io/2018/10/07/observer/)

### 3.17备忘录模式

备忘录模式：在不破坏封装性的前提下，保存对象的内部状态

[备忘录模式](https://songwell1024.github.io/2018/10/18/MementoPattern/)

### 3.18中介者模式

中介者模式：用一个中介对象来封装一系列的对象交互

[中介者模式](https://songwell1024.github.io/2018/10/18/MediatorPattern/)

### 3.19命令模式

命令模式：将命令请求封装为一个对象，使得可用不同的请求来进行参数化

[命令模式](https://songwell1024.github.io/2018/10/17/CommandMode/)

### 3.20访问者模式

访问者模式：在不改变数据结构的前提下，增加作用于一组对象元素新的功能

[访问者模式](https://songwell1024.github.io/2018/10/18/VistorPattern/)

### 3.21责任链模式

责任链模式：请求发送者和接收者之间解耦，使的多个对象都有机会处理这个请求

[责任链模式](https://songwell1024.github.io/2018/10/17/ChainmsPattern/)

### 3.22迭代器模式

迭代器模式：一种遍历访问聚合对象中各个元素的方法，不暴露该对象的内部结构

[迭代器模式](https://songwell1024.github.io/2018/10/18/IteratorMode/)

### 3.23 复合模式

复合模式：多个模式的组合

[复合模式](https://songwell1024.github.io/2018/10/17/compoundMode/)
