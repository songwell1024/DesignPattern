package observer.oo;

/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class WeatherData {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;
    private CurrentConditions currentConditions;

    public WeatherData( CurrentConditions currentConditions){
        this.currentConditions = currentConditions;
    }
    public float getmTemperature() {
        return mTemperature;
    }
    public float getmPressure() {
        return mPressure;
    }
    public float getmHumidity() {
        return mHumidity;
    }

    public void dataChange(){
        currentConditions.update( getmTemperature(),getmPressure(),getmHumidity());
    }

    public void setData(float mTemperature,float mPressure,float mHumidity)
    {
        this.mTemperature=mTemperature;
        this.mPressure=mPressure;
        this.mHumidity=mHumidity;
        dataChange();
    }

}
