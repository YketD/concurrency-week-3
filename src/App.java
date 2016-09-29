/**
 * Created by yketd on 29-9-2016.
 */
public class App {
    static int KOPER_AMT = 8;
    static int KIJKER_AMT = 20;
    static Hiswa hiswa;
    public static void main(String[] args) {
        new App().run();
    }


    public void run(){
        hiswa = new Hiswa();
        hiswa.start();

        for (int i = 0; i < KOPER_AMT ; i++){
            Koper koper = new Koper();
            koper.start();
        }

        for (int i = 0; i < KIJKER_AMT ; i++){
            Kijker kijker = new Kijker();
            kijker.start();
        }
    }
    public static long getRandomTime(){
        return (long) (Math.random() * 200000);
    }
}
