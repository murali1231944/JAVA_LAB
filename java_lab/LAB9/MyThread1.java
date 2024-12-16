package LAB9.Threads;

public class MyThread1 extends Thread {
  public void run() {
      System.out.println("r1");
      try {
          Thread.sleep(500);
      } catch (InterruptedException ie) {
          // Handle interruption
      }
      System.out.println("r2");
  }

  public static void main(String[] args) {
      MyThread1 t1 = new MyThread1();
      MyThread1 t2 = new MyThread1();
      t1.start();
      t2.start();
  }
}

