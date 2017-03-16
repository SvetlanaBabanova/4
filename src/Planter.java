/**
 * Created by isvet on 16.03.17.
 */
public class Planter implements Runnable {
    private Foreman foreman = new Foreman();
    private int N;

    Planter(Foreman fm, int n){
        N = n;
        foreman = fm;
    }

    @Override
    public void run() {
        for (int i = 1; i < N + 1; ++i) {
            foreman.plant(i);
        }
    }
}
