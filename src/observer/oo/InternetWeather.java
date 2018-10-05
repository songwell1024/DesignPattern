package observer.oo;


/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class InternetWeather {

    public static void main(String[] args){
        CurrentConditions currentConditions = new CurrentConditions();
        WeatherData weatherData  = new WeatherData(currentConditions);
        weatherData.setData(10,100,20);
    }



}
