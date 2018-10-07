package factory.pizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public abstract class Pizza {

    public String name;

    public abstract void Prepare();

    public void bake(){
        System.out.println(name + ":"+ "bake");
    }

    public void cut(){
        System.out.println(name + ":"+ "cut");
    }
    public void box(){
        System.out.println(name + ":"+ "box");
    }

    public void setName(String name){
        this.name = name;
    }


}
