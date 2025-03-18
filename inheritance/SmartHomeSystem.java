class SmartDevice {
    private String name;
    private boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(name + " is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name + " is now OFF.");
    }
}

class SmartLight extends SmartDevice {
    private int brightness;

    public SmartLight(String name) {
        super(name);
        this.brightness = 50;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
            System.out.println(getName() + " brightness set to " + brightness + "%.");
        } else {
            System.out.println("Invalid brightness level. Please set between 0 and 100.");
        }
    }
}

class SmartThermostat extends SmartDevice {
    private double temperature;

    public SmartThermostat(String name) {
        super(name);
        this.temperature = 22.0;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println(getName() + " temperature set to " + temperature + "°C.");
    }
}

class SmartSpeaker extends SmartDevice {
    private int volume;

    public SmartSpeaker(String name) {
        super(name);
        this.volume = 50;
    }

    public void playMusic(String song) {
        if (isOn()) {
            System.out.println("Playing \"" + song + "\" on " + getName() + ".");
        } else {
            System.out.println(getName() + " is OFF. Please turn it ON to play music.");
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println(getName() + " volume set to " + volume + "%.");
        } else {
            System.out.println("Invalid volume level. Please set between 0 and 100.");
        }
    }
}

public class SmartHomeSystem {

    public static void main(String[] args) {

        SmartLight light = new SmartLight("Living Room Light");
        SmartThermostat thermostat = new SmartThermostat("Bedroom Thermostat");
        SmartSpeaker speaker = new SmartSpeaker("Kitchen Speaker");

        light.turnOn();
        light.setBrightness(75);

        thermostat.turnOn();
        thermostat.setTemperature(24.5);

        speaker.turnOn();
        speaker.setVolume(65);
        speaker.playMusic("Shape of You");

        light.turnOff();
        thermostat.turnOff();
        speaker.turnOff();
    }
}
