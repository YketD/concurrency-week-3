/**
 * Created by yketd on 29-9-2016.
 */
public class Koper extends Thread {
    boolean koperEntered = false;

    public void run() {

    }

    public void justLive(){
        try {
            Thread.sleep(App.getRandomTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void enterHiswa(){
        App.hiswa.enter("Kijker");
        while (!koperEntered)
            koperEntered = App.hiswa.enter("Koper");
    }
}
