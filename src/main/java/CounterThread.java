// NOT NECESSARY FOR LAB, JUST USING AS PRACTICE TEMPLATE

public class CounterThread extends Thread {
    private final Counter counter;

    public CounterThread(Counter counter) {
    this.counter = counter;
    }

    @Override
    public void run() {
        counter.inc();
    }

}
