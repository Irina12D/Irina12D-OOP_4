public class LongTerm extends Notes{
    private DateTime dateCreated;       // дата / время начала выполнения
    private DateTime dateEndings;       // дата / время окончания реализации
    private String content;

    public LongTerm(String title, String content, int dayBegin, int monthBegin, int yearBegin, int dayEnd, int monthEnd, int yearEnd, int priority, boolean isNotification) {
        super(title, priority, isNotification);
        this.dateCreated = new DateTime(dayBegin,monthBegin, yearBegin, 0,0);
        this.dateEndings = new DateTime(dayEnd,monthEnd, yearEnd, 0,0);
        this.content = content;
     }

    public DateTime getDateCreated() {
        return dateCreated;
    }

    public DateTime getDateEndings() {
        return dateEndings;
    }

    public String getContent() {
        return content;
    }

    public void setDateCreated(DateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateEndings(DateTime dateEndings) {
        this.dateEndings = dateEndings;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                " начало выполнения: " + dateCreated.toString() + "\n" +
                " описание: " + content + "\n" +
                " окончание: " + dateEndings.toString() + "\n" ;
    }
}
