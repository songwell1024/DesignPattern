package observer.ObserverIn;

import java.util.Observable;

/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class WeatherData extends Observable{
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    public float getTemperature()
    {
        return mTemperatrue;
    }

    public float getPressure()
    {
        return mPressure;
    }

    public float getHumidity()
    {
        return mHumidity;
    }
    public void dataChange(){
        this.setChanged(); //boolean类型的，通知观察者是否发生了改变
        this.notifyObservers(new Data(getTemperature(),getPressure(),getHumidity()));
    }

    public void setData(float mTemperatrue,float mPressure,float mHumidity)
    {
        this.mTemperatrue=mTemperatrue;
        this.mPressure=mPressure;
        this.mHumidity=mHumidity;
        dataChange();
    }

    public class Data
    {
        public float mTemperatrue;
        public float mPressure;
        public float mHumidity;
        public Data(float mTemperatrue,float mPressure,float mHumidity)
        {
            this.mTemperatrue=mTemperatrue;
            this.mPressure=mPressure;
            this.mHumidity=mHumidity;
        }
    }
}
