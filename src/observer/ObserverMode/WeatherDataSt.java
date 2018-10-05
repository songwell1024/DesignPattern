package observer.ObserverMode;

import java.util.ArrayList;

/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public class WeatherDataSt implements Subject {
    private float mTemperature;
    private float mPressure;
    private float mHumidityp;
    ArrayList<Observer> observers;

    public float getmTemperature() {
        return mTemperature;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidityp() {
        return mHumidityp;
    }

    public WeatherDataSt(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (observers.contains(o)){
            observers.remove(o);
        }

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            observers.get(i).update(getmTemperature(),getmPressure(),getmHumidityp());
        }
    }

    public void dataChange(){
       notifyObservers();
    }

    public void setData(float mTemperature,float mPressure,float mHumidity){
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidityp = mHumidity;
        dataChange();
    }
}
