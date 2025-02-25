interface Notification {
    void sendNotification();
}
class EmailNotification   implements Notification {
    private String emailAdress;
    public EmailNotification(String emailAdress){
        this.emailAdress=emailAdress;
    }
    public void sendNotification() {
        System.out.println("Email notification sent to:"+emailAdress);
    }
}
class SMSNotification implements Notification {
private String phoneNumber;
public SMSNotification(String phoneNumber){
this.phoneNumber=phoneNumber;
}
public void sendNotification(){
System.out.println("SMS notification sent to;"+phoneNumber);
}
}
class PushNotification implements Notification {
    private String deviceId;public PushNotification(String deviceId){
        this.deviceId=deviceId;
    }
    public void sendNotification() {
        System.out.println("Push notification sent to deviceId:"+deviceId);
    }
}
public class NotificationSystem{
    public static void main(String[]args){
        Notification emailNotification=new EmailNotification("gripsy@psgrkcw.ac.in");
        Notification SmsNotification=new SMSNotification("+123456789");
        Notification pushNotification=new PushNotification("device 123");
        emailNotification.sendNotification();
        SmsNotification.sendNotification();
        pushNotification.sendNotification();
    }
}


      OUTPUT
Email notification sent to:gripsy@psgrkcw.ac.in
SMS notification sent to;+123456789
Push notification sent to deviceId:device 123
BUILD SUCCESSFUL (total time: 0 seconds)
