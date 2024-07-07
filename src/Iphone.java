 class Iphone implements Smartphones, IOS {


    @Override
    public void call(String number) {
        System.out.println("iPhone calling " + number);

    }

    @Override
    public void sms(String number, String message) {
        System.out.println("iPhone sending SMS to " + number + ": " + message);
    }

    @Override
    public void internet(String url) {
        System.out.println("iPhone browsing " + url);
    }

     @Override
     public void secureSystem() {
         System.out.println("iPhone running on secure iOS");
     }
 }
