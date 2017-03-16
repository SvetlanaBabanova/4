/**
 * Created by isvet on 16.03.17.
 */
class Foreman {
    private int count = 1;

    synchronized void dig(int i) {
        while (count != 1) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("Я первый рабочий и я копаю яму для саженца " + i);
        count = 2;
        notifyAll();
    }

    synchronized void plant(int i) {
        while (count != 2) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("Я второй рабочий и я сажаю " + i + " саженец");
        count = 3;
        notifyAll();
    }

    synchronized void tie(int i) {
        while (count != 3) {
            try {
                wait();
            } catch (InterruptedException ignored) {
            }
        }
        System.out.println("Я третий рабочий и я подвязываю " + i + " саженец");
        count = 1;
        notifyAll();
    }
}
