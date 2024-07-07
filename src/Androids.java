 class Androids implements Smartphones, LinuxOS {


    @Override
    public void call(String number) {
        System.out.println("Android calling " + number);

    }

    @Override
    public void sms(String number, String message) {
        System.out.println("Android sending SMS to " + number + ": " + message);
    }

    @Override
    public void internet(String url) {
        System.out.println("Android running on open-source Linux OS");
    }

     @Override
     public void openSource() {
         System.out.println("Android running on open-source Linux OS");
     }
 }
