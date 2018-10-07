package factory.SimpleFactory;

import factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class OrderPizza {

    public OrderPizza(SimplePizzaFactory simplePizzaFactory){
        setSimplePizzaFactory(simplePizzaFactory);
    }

    public void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory){
        String orderType;
        do {
            orderType  = getType();
            Pizza pizza  =simplePizzaFactory.CreatePizza(orderType);
            if (pizza != null){
                pizza.Prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }

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
