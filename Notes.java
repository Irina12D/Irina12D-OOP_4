public abstract class Notes {
    private String title;               // название задачи
    private int priority;
    /* приоритет:
        1 - важная и обязательная к выполнению,
        2 - важная, но может быть не выполнена
        3 - неважная к выполнению, но которую желательно всё же реализовать
        4 - неважная к выполнению, на которую можно совсем забить
     */
    private boolean isNotification;        // требует уведомления

    public Notes(String title, int priority, boolean isNotification) {
        this.title = title;
        this.priority = priority;
        this.isNotification = isNotification;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isNotification() {
        return isNotification;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setNotification(boolean notification) {
        isNotification = notification;
    }

    @Override
    public String toString() {
        return String.format("%S",title);
    }
}
