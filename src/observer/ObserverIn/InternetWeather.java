package observer.ObserverIn;

/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class InternetWeather {
    public static void main(String[] args){
        ConcurrentConditions concurrentConditions = new ConcurrentConditions();
        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(concurrentConditions);
        weatherData.setData(10,100,10);
    }

}
