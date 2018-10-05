package observer.ObserverMode;

/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class ForcastConditions implements Observer{
    private float mTemperature;
    private float mPressure;
    private float mHumidityp;
    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidityp = mHumidity;
        displsy();
    }

    public void displsy(){
        System.out.println("**明天温度:"+(mTemperature+Math.random())+"**");
        System.out.println("**明天气压:"+(mPressure+10*Math.random())+"**");
        System.out.println("**明天湿度:"+(mHumidityp+Math.random())+"**");
    }
}
