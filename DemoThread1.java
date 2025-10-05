 class A  implements Runnable{//instead of using the extend we use implement for inhertance

    public void run(){
            for(int i = 0 ; i < 10 ; i++){
        System.out.println("hello");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    }

    
}
 class B implements Runnable{//Runnable is a interface for using the thread class
    public void run(){
            for(int i = 0 ; i < 10 ; i++){
        System.out.println("hi");
                try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    }
    
}

public class DemoThread1 {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);


   
        t1.start();

        t2.start();
    }
    
}
