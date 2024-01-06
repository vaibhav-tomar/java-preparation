package systemdesign.designpattern.commanddesignpattern;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc() {
        isOn = true;
        System.out.println("ac turned on");
    }

    public void turnOffAc() {
        isOn = false;
        System.out.println("ac turned off");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("temperature changed to : " + temperature);
    }
}
