class Counter {//for mutable things
    int count = 0;
    public synchronized void  increment(){//synchronized is main thing that allow us to use only one thread at a time!!
        count++;
    }
    
}

public class DemoThread1LA {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        Runnable obj1 = () -> {
            for(int i = 0 ; i < 1000 ; i++){
                c.increment();
    }
    
        };
        Runnable obj2 = () -> {
            for(int i = 0 ; i < 1000 ; i++){
                 c.increment();
    } 
        };
       Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();//join. help in waiting proceess

        System.out.println(c.count);
    }
    
}

