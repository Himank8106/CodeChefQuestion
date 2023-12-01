/* Link - https://leetcode.com/problems/print-in-order/ */

class Foo {
    private boolean firstDone, secondDone;

    public Foo() {
        firstDone = false;
        secondDone = false;
    }

    public void first(Runnable printFirst) throws InterruptedException {
        synchronized (this) {
            printFirst.run();
            firstDone = true;
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        synchronized (this) {
            while (!firstDone) {
                wait();
            }
            printSecond.run();
            secondDone = true;
            notifyAll();
        }
        
    }

    public void third(Runnable printThird) throws InterruptedException {
        synchronized (this) {
            while (!secondDone) {
                wait();
            }
            printThird.run();
            notifyAll();
        }
    }    
}



/* 
public Foo() {
        
    }
    int count = 0;

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized(this){
            this.count++;
            printFirst.run();
            notifyAll();
        }
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        synchronized(this){
            while(this.count<1){
                wait();
            }
            this.count++;
            printSecond.run();
            notifyAll();
        }
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized(this){
            while(this.count<2){
                wait();
            }
            printThird.run();
            notifyAll();
        }
    }
*/

