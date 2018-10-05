package observer.ObserverMode;


/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class InternetWeatherOb {

    public static void main(String[] args){
        ConcurrentConditions concurrentConditions = new ConcurrentConditions();
        WeatherDataSt weatherDataSt = new WeatherDataSt();
        weatherDataSt.registerObserver(concurrentConditions);
        weatherDataSt.setData(10,200,20);

        ForcastConditions forcastConditions = new ForcastConditions();
        weatherDataSt.registerObserver(forcastConditions);
        weatherDataSt.setData(20,300,30);
    }
}
