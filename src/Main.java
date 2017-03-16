/**
 * Created by isvet on 16.03.17.
 */
public class Main {
    public static void main(String[] args) {
        int N = 0;
        try {
            N = Integer.parseInt(args[0]);
        } catch (Exception ignored) {
        }
        Foreman foreman = new Foreman();
        Digger digger = new Digger(foreman, N);
        Planter planter = new Planter(foreman, N);
        Tieman tieman = new Tieman(foreman, N);
        new Thread(digger).start();
        new Thread(planter).start();
        new Thread(tieman).start();
    }
}
