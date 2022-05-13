import org.testng.annotations.Test;

public class ParallelTestB {
    @Test()
    public void method1() throws InterruptedException {
        Thread.sleep(11000);
        System.out.println("This is method1 from class B");
        System.out.println(Thread.currentThread().getId() + "\n");
    }
    @Test()
    public void method2() throws InterruptedException {
        Thread.sleep(12000);
        System.out.println("This is method2 from class B");
        System.out.println(Thread.currentThread().getId() + "\n");
    }
    @Test()
    public void method3() throws InterruptedException {
        Thread.sleep(13000);
        System.out.println("This is method3 from class B");
        System.out.println(Thread.currentThread().getId() + "\n");
    }
}
