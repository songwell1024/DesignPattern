package TemplateMethod;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public abstract class HotDrinkWithHook {

    public final void  prepareRecipe(){
        boilWater();
        brew();
        pourIncup();
        if (WantCondimentsHook()){
            addCondiments();
        }else {
            System.out.println("No Condiments");
        }

    }

    public boolean WantCondimentsHook(){
        return true;
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
