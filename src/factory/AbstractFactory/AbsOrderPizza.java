package factory.AbstractFactory;

import factory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class AbsOrderPizza {

    AbsFactory absFactory;

    public AbsOrderPizza(AbsFactory absFactory){
        setAbsFactory(absFactory);

    }

    private void setAbsFactory(AbsFactory absFactory){
        Pizza pizza = null;
        String ordertype;

        do {
            ordertype  = getOrderType();
            this.absFactory = absFactory;
            if (absFactory != null){
                pizza = absFactory.CreatePizza(ordertype);
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
        }while (true);
    }

    private String getOrderType(){
        try{
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            String strs = strIn.readLine();
            return strs;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
