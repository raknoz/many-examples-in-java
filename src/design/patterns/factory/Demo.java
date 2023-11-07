package design.patterns.factory;

public class Demo {
  public static void main(String[] args) {
    NotificationFactory notificationFactory = new NotificationFactory();
    Notification notification = notificationFactory.createNotification("SMS");
    notification.notifyUser();
  }
}
