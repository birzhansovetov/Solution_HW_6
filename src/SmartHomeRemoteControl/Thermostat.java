package SmartHomeRemoteControl;

public class Thermostat {
    private int previousTemp = 20;
    private int currentTemp = 20;

    public void setTemperature(int temp) {
        previousTemp = currentTemp;
        currentTemp = temp;
        System.out.println("[Thermostat] Setting temperature to " + temp + "°C");
    }

    public void revert() {
        currentTemp = previousTemp;
        System.out.println("[Thermostat] Reverting to previous temperature: " + previousTemp + "°C");
    }
}
