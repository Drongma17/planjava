package reviews.desparate;

import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(float temperature);
}

// Subject interface
interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

// Concrete Subject
class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }

    public void setTemperature(float newTemp) {
        System.out.println("WeatherStation: temperature changed to " + newTemp);
        this.temperature = newTemp;
        notifyObservers();
    }
}

// Concrete Observer 1
class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("PhoneDisplay: Updated temperature = " + temperature + "°C");
    }
}

// Concrete Observer 2
class LEDDisplay implements Observer {
    @Override
    public void update(float temperature) {
        System.out.println("LEDDisplay: Updated temperature = " + temperature + "°C");
    }
}

// Main
public class ObserverPatternDemo {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer led = new LEDDisplay();

        station.addObserver(phone);
        station.addObserver(led);

        station.setTemperature(25.0f);
        station.setTemperature(30.0f);
    }
}
