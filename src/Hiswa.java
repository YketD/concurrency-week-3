import javax.management.monitor.Monitor;

/**
 * Created by yketd on 29-9-2016.
 */
public class Hiswa extends Monitor {
    @Override
    public void start() {

    }

    public boolean enter(String clas) {
        switch (clas) {
            case "Kijker":
                System.out.println("kijker requested enter at hiswa");
                return true;
            case "Koper":
                System.out.println("Koper requested enter at hiswa");
                return true;
            default:
                System.out.println("an unknown class called your enter method, or you misspelled a case");
                return false;
        }
    }

    @Override
    public void stop() {

    }
}
