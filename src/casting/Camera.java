package casting;


/**
 * Created by ronald on 09/10/16.
 */
public class Camera extends Machine implements Microwave, Refrigerator{
    @Override
    public void start() {
        //super.start();
        System.out.println("Camera Starting");
    }

    @Override
    public void stop() {
        //super.stop();
        System.out.println("Camera stopping");
    }
    public void snapshot(){
        System.out.println("Camera snapping");
    }

    @Override
    public void radiation() {
        System.out.println("Camera's don't contain radiation.");
    }
}
