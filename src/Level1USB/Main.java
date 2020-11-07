package Level1USB;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        USB usbKeyboard = new Keyboard();
        computer.useDevice(usbKeyboard);

        computer.powerOff();
    }
}
