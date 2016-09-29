/**
 * Created by yketd on 29-9-2016.
 */
public class Kijker extends Thread {
    boolean kijkerEntered = false;

    public void run(){
        justLive();
        enterHiswa();
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
        while (!kijkerEntered)
            kijkerEntered = App.hiswa.enter("Koper");
    }
}
