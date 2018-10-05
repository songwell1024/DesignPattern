package observer.ObserverMode;

/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class ConcurrentConditions implements Observer{

    private float mTemperature;
    private float mPressure;
    private float mHumidityp;

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature  =mTemperature;
        this.mPressure = mPressure;
        this.mHumidityp = mHumidity;
        display();
    }

    public void display(){
        System.out.println("***Today mTemperatrue:" + mTemperature + "***");
        System.out.println("***Today mPressure:" + mPressure + "***");
        System.out.println("***Today mHumidity:" + mHumidityp + "***");
    }
}
