package TemplateMethod;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public abstract class HotDrink {

    public final void  prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        addCondiments();
    }

    private void boilWater(){
        System.out.println("boil water");
    }

    public abstract void brew();

    private void pourIncup(){
        System.out.println("pour in cup");
    }

    public abstract void addCondiments();

}
