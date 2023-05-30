package inheritance;

class Watch{
    String company;
    String applications;

    public void setWatch(String company,String applications){
        this.company = company;
        this.applications = applications;
    }
    public void getWatch(){
        System.out.println("COMPANY      - "+this.company);
        System.out.println("APPLICATIONS - "+this.applications);
    }
}

interface OS{
    public String OS_Name = "ANDROID";
    public void getOS();
    public void setFeatures(String[] features);
    public void setSensors(String[] sensors);
}

class SmartWatch extends Watch implements OS{
    int price;
    int battery_capacity;
    String[] features;
    String[] sensors;

    public void setSmartWatch(int price, int battery_capacity){
        this.price = price;
        this.battery_capacity = battery_capacity;
    }

    public void getOS() {
        System.out.println("OPERATING SYSTEM - "+this.OS_Name);
    }

    public void setFeatures(String[] features){
        this.features = features;
    }

    public void setSensors(String[] sensors) {
        this.sensors = sensors;
    }

    public void getSmartWatch(){
        System.out.println("PRICE - "+this.price);
        System.out.println("BATTERY CAPACITY "+this.battery_capacity);
        System.out.println("FEATURES - ");
        for (int i = 0; i < features.length; i++) {
            System.out.println(features[i]);
        }
        System.out.println("SENSORS - ");
        for (int i = 0; i < sensors.length; i++) {
            System.out.println(sensors[i]);
        }
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        SmartWatch sm = new SmartWatch();
        sm.setWatch("Fastrack","Date and Time");
        sm.setSmartWatch(7500,24);
        sm.setFeatures(new String[]{"O2 Level","Heart Rate","Notifications","Sports","Music"});
        sm.setSensors(new String[]{"Proximity Sensor","Accelerometer","Barometer","Heat sensor"});

        sm.getWatch();
        sm.getOS();
        sm.getSmartWatch();
    }
}
