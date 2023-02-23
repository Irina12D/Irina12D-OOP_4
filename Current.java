public class Current extends Notes{
    private DateTime timeCreated;       // время начала выполнения
    public Current(String title, int hour, int minutes, int priority, boolean isNotification) {
        super(title, priority, isNotification);
        this.timeCreated = new DateTime(hour,minutes);
    }


    @Override
    public String toString() {
        return super.toString() + "\n " + timeCreated.toString();
    }

    public DateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(DateTime timeCreated) {
        this.timeCreated = timeCreated;
    }
}
