package factory.FactoryMethod;

import factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public abstract class  OrderPizza {
    Pizza pizza = null;
    public String orderType;

    public OrderPizza(){
       do {
           orderType = getType();
           pizza = CreatePizza(orderType);
           if (pizza != null){
               pizza.Prepare();
               pizza.bake();
               pizza.cut();
               pizza.box();
           }
       }while (true);
    }

    public abstract Pizza CreatePizza(String OrderType);

    private String getType(){
        try {
            BufferedReader strIn  = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strIn.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }

}
