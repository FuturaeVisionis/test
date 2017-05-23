package isAvshasA;

/**
 * Created by ronald on 09/10/16.
 */
public class Camera { // example of the camera having a machine!

    Machine machine = new Machine();

    public void start() {
        machine.start();
    }

    public static void main(String[] args) {
        Camera camera = new Camera();
        camera.start();

        Computer computer = new Computer();
        computer.start();

    }
}
