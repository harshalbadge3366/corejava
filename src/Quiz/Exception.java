package Quiz;

public class Exception implements Runnable {  
	  
    @Override  
    public void run() {  
        System.out.println("Thread has ended");  
    }  
   
    public static void main(String[] args) {  
       Exception ex = Exception();  
        Thread t1= new Thread(ex);  
        t1.start();  
        System.out.println("Hi");  
    }  
}  
