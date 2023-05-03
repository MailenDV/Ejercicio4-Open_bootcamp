class Main {
    public static void main(String[] args) {
        SmartPhone mySmartPhone = new SmartPhone("Apple", 24);
        SmartWatch mySmartWatch = new SmartWatch("Samsung", 48);

        System.out.println("Smartphone brand: " + mySmartPhone.getBrand());
        System.out.println("Smartwatch battery life: " + mySmartWatch.getBatteryLife() + " hours");
    }
}
