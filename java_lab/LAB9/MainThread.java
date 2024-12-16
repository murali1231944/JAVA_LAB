package LAB9;

class MyThread extends Thread {
  // Job of the thread
  public void run() {
      for (int i = 0; i < 10; i++) {
          System.out.println("Child Thread");
      }
  }
}

public class MainThread {
  
  public static void main(String[] args) {
      MyThread mt = new MyThread(); 
      mt.start();

      for (int i = 0; i < 10; i++) {
          System.out.println("Main Thread");
      }
  }
}

