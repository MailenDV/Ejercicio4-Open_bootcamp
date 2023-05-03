public class SmartDevice {
    private String brand;
    private int batteryLife;

    public SmartDevice() {
        // Constructor vacío
    }

    public SmartDevice(String brand, int batteryLife) {
        this.brand = brand;
        this.batteryLife = batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    // getters y setters
}

