//
//public class main {
//    public static void main(String args[])
//    {
////Thread1
//        Count count = new Count();
//        try
//        {
//            //thread2
//            while(count.getMyThread().isAlive())
//            {
//                System.out.println("Main thread will be alive till the child thread is live");
//                Thread.sleep(1500);
//            }
//        }
//        catch(InterruptedException e)
//        {
//            System.out.println("Main thread interrupted");
//        }
//        System.out.println("Main thread2 run is over" );
//    }
//
//}
public class Main {
    public static int DISTANCE = 100;

    public static int STEP = 2;

    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");

        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);

        System.out.println("Distance: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
//Phương thức isAlive () của lớp luồng kiểm tra xem luồng đó còn sống hay không.
// Một luồng được coi là còn sống khi phương thức start () của lớp luồng đã được gọi và luồng vẫn chưa chết.
// Phương thức này trả về true nếu luồng vẫn đang chạy và chưa kết thúc.