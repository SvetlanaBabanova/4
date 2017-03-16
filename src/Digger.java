/**
 * Created by isvet on 16.03.17.
 */
public class Digger implements Runnable {
    private Foreman foreman = new Foreman();
    private int N;

    Digger(Foreman fm, int n) {
        N = n;
        foreman = fm;
    }

    @Override
    public void run() {
        for (int i = 1; i < N + 1; ++i) {
            foreman.dig(i);
        }
    }
}
