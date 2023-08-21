package BehaviouralDesignPatterns.IteratorPattern;

public class NotificationsIterator implements Iterator{
    Notification[] notificationList;
    int pos = 0;

    public  NotificationsIterator (Notification[] notificationList)
    {
        this.notificationList = notificationList;
    }

    public Object next()
    {
        Notification notification =  notificationList[pos];
        pos += 1;
        return notification;
    }

    public boolean hasNext()
    {
        if(pos >= notificationList.length || notificationList[pos] == null)
            return false;
        else
            return true;
    }
}
