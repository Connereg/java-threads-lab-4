public class Counter {

  long count = 0;

  public synchronized void inc() {
      count++;
  }

  public synchronized long getCount() {
      return count;
  }
}