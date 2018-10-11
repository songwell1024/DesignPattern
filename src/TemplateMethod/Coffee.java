package TemplateMethod;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class Coffee extends HotDrink {
    @Override
    public void brew() {
        System.out.println("brew coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("add sugar and milk");
    }
}
