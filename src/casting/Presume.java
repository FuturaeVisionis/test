package casting;

/**
 * Created by ronald on 09/10/16.
 */
public class Presume {

    public static void main(String[] args) {

        Machine machine = new Camera();
        machine.start();
        machine.stop();

        //((Camera) machine).snapshot();

        Camera camera = (Camera)machine;
        camera.snapshot();
        camera.radiation();
        Refrigerator.freeze();


    }
}
