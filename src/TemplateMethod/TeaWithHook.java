package TemplateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class TeaWithHook extends HotDrinkWithHook {
    @Override
    public void brew() {
        System.out.println("brew tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("add lemon");
    }

    @Override
    public boolean WantCondimentsHook(){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Would you like add milk and sugar in your coffee (y/n)");
        try{
            String str = bufferedReader.readLine();
            if (str.equals("y")){
                return true;
            }else if (str.equals("n")){
                return false;
            }else {
                System.out.println("you have input nothing");
                return false;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return false;
    }

}
