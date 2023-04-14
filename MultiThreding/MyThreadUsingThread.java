// Creating Thread using Thread class

class MyThreadUsingThread extends Thread {
    public void run() {
        // task for thread
        for(int i= 10; i>=0; i--) {
            System.out.println("another thread= "+i);
            try {
                Thread.sleep(2000);
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    // public static void main(String[] args) {
    //     // create object of myThread class
    //     MyThreadUsingThread t2= new MyThreadUsingThread();
    //     t2.start();
// }
}

