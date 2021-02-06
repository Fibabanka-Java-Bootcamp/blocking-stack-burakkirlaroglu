package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
	// write your code here

       Queue<String> queueTest = new Queue<>();

       queueTest.send("test1");
       queueTest.send("test2");
       queueTest.send("test3");

       System.out.println(queueTest.poll());

       System.out.println(queueTest.poll());

       System.out.println(queueTest.poll());
    
    
    }
}
