public class threadDemo {

    //实现线程的两种方式，1。继承Thread 2.实现Runnable接口
    public static void main(String[] args) {
        new Thread(() -> System.out.println(MySum.getSum()+"")).start();
    }

    static class MySum{
        public static int getSum(){
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum+= i;
            }
            return sum;
        }
    }
}
