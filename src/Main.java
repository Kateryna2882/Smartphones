public class Main {
    public static void main(String[] args) {
        Androids android = new Androids();



        android.call("123-456-7890");
        android.sms("123-456-7890", "Hello from Android!");
        android.internet("www.example.com");
        android.openSource();

        Iphone iphone = new Iphone();

        iphone.call("098-765-4321");
        iphone.sms("098-765-4321", "Hello from iPhone!");
        iphone.internet("www.example.com");
        iphone.secureSystem();
    }
}