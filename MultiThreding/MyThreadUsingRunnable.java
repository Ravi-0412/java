// Creating thread using Runnable Interface

class MyThreadUsingRunnable implements Runnable {
    public void run() {
        for(int i= 0; i<= 10; i++) {
            System.out.println("Value of i is: "+i);
            try {
                Thread.sleep(1000); //if you want thread to wait for sometime after printing any instruction . time in milisecond
            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
    public static void main(String[] args) {
        // create object of myThread class
        MyThreadUsingRunnable t1= new MyThreadUsingRunnable();
        Thread thr= new Thread(t1);
        //Object of thread using Thread Class
        MyThreadUsingThread t2= new MyThreadUsingThread();
        // thr.start();
        t2.start();
        thr.start();
    }
}




N