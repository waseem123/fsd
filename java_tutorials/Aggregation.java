class InputDevices {
    String[] devices = {"Mouse", "Keyboard", "Scanner", "Joysticks"};
    String usage = "Used for giving input to computer";

    public void getInputDevices() {
        System.out.println("DEVICES - ");
        for (String device : devices) {
            System.out.println(device);
        }
        System.out.println("USAGE - " + usage);
    }
}

class OutputDevices {
    String[] devices = {"Monitor", "Printer", "Speaker", "Projector"};
    String usage = "Used for giving output from computer";

    public void getOutputDevices() {
        System.out.println("DEVICES - ");
        for (String device : devices) {
            System.out.println(device);
        }
        System.out.println("USAGE - " + usage);
    }
}

class Memory {
    String capacity = "8GB";
    String usage = "Used for processing the data in temporary memory";

    public void getMemory() {
        System.out.println("CAPACITY - " + capacity);
        System.out.println("USAGE - " + usage);
    }
}

class Computer{
    InputDevices input = new InputDevices();
    OutputDevices output = new OutputDevices();
    Memory memory = new Memory();

    public void getComputer(){
        System.out.println("INPUT DEVICES - ");
        input.getInputDevices();
        System.out.println("OUTPUT DEVICES - ");
        output.getOutputDevices();
        System.out.println("MEMORY DEVICES - ");
        memory.getMemory();
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.getComputer();
    }
}
