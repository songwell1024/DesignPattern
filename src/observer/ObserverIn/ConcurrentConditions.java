package observer.ObserverIn;

import java.util.Observable;
import java.util.Observer;

/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class ConcurrentConditions implements Observer {

    private float mTemperature;
    private float mPressure;
    private float mHumidityp;

    @Override
    public void update(Observable o, Object arg) {
        this.mTemperature = ((WeatherData.Data) arg).mTemperatrue;
        this.mPressure = ((WeatherData.Data) arg).mPressure;
        this.mHumidityp = ((WeatherData.Data) arg).mHumidity;
        display();
    }
    public void display()
    {
        System.out.println("***Today mTemperatrue:" +mTemperature+"***");
        System.out.println("***Today mPressure:" +mPressure+"***");
        System.out.println("***Today mHumidity:" +mHumidityp+"***");
    }
}
