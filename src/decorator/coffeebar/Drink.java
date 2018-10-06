package decorator.coffeebar;

/**
 * 在面向对象的概念中，所有的对象都是通过类来描绘的，但是并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。

 抽象类的定义
 是对一系列看上去不同，但是本质上相同的具体概念的抽象，往往用来表征我们在对问题进行分析、设计中得出的抽象概念
 * @author WilsonSong
 * @date 2018/10/6/006
 */
public abstract class Drink {
    public String description = "";
    private float price = 0f;

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();
}
