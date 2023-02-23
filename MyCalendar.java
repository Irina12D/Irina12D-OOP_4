import java.util.*;

public class MyCalendar {
    private ArrayList<Notes> calendar = new ArrayList<>();
    public void setCurrentNote(int day, int month, int hour, int minutes, String title, int priority, boolean isNotification)
    {
        Current note = new Current(title, hour, minutes, priority, isNotification);
        calendar.add(note);
    }

    public void setLongTermNote(int dayBegin, int monthBegin, int yearBegin, int dayEnd, int monthEnd, int yearEnd, String title, String content, int priority, boolean isNotification){
        LongTerm note = new LongTerm(title, content, dayBegin, monthBegin, yearBegin, dayEnd, monthEnd, yearEnd, priority, isNotification);
        calendar.add(note);
    }

    public void deleteNote(int dayBegin, int monthBegin, int yearBegin, String title){
        DateTime paramDate = new DateTime(dayBegin, monthBegin, yearBegin,0,0);
        boolean notFind = true;
        for(Notes note: calendar) {
           if(note.getTitle().equals(title))
           {
              DateTime dateNote;
              if (note instanceof Current) {
                 Current curNote = (Current) note;
                 dateNote = curNote.getTimeCreated();
              }
              else {
                 LongTerm longNote = (LongTerm) note;
                 dateNote = longNote.getDateCreated();
              }
              if (paramDate.equals(dateNote)){
                   System.out.println("Заметка удалена");
                   notFind = false;
                   break;
              }
           }
        }
        if(notFind)
            System.out.println("Нет такой заметки");
    }


    /*
    private ArrayList<Notes> sortList(){
        Collections.sort(calendar, new NoteComparator());
        return sortList();
    }
    */

    private ArrayList<Notes> sortList(ArrayList<Notes> list){
        boolean obmen = true;
        int n = list.size();
        int k = 0;
        for (; k < n - 1 && obmen; k++) {
            obmen = false;
            DateTime dateA;
            Notes a = list.get(k);
            if (a instanceof Current) {
                Current aDate = (Current) a;
                dateA = aDate.getTimeCreated();
            }
            else {
                LongTerm aDate = (LongTerm) a;
                dateA = aDate.getDateCreated();
            }
            for (int i = 0; i < n - k - 1; i++) {
                Notes b = list.get(i);
                DateTime dateB;
                if (b instanceof Current) {
                    Current bDate = (Current) b;
                    dateB = bDate.getTimeCreated();
                }
                else {
                    LongTerm bDate = (LongTerm) b;
                    dateB = bDate.getDateCreated();
                }
                boolean conditionYear = dateA.getYear() > dateB.getYear();
                boolean conditionMonth = dateA.getYear() == dateB.getYear() && dateA.getMonth() > dateB.getMonth();
                boolean conditionDay = dateA.getMonth() == dateB.getMonth() && dateA.getDay() > dateB.getDay();
                boolean conditionHour = dateA.getMonth() == dateB.getMonth() && dateA.getDay() == dateB.getDay() && dateA.getHour() > dateB.getHour();
                boolean conditionMinutes = dateA.getMonth() == dateB.getMonth() && dateA.getDay() == dateB.getDay() && dateA.getHour() == dateB.getHour() && dateA.getMinute() > dateB.getMinute();
                boolean condition = conditionYear || conditionMonth || conditionDay || conditionHour || conditionMinutes;
                if (condition)
                {
                    Collections.swap(list, i, i + 1);
                    obmen = true;
                }
            }
        }
        return list;
    }


    public void printCalendar(){
        ArrayList<Notes> toPrint = sortList(calendar);
        for(Notes note: calendar){
            String text;
            if (note instanceof Current) {
                Current curNote = (Current) note;
                text = curNote.toString();
            }
            else {
                LongTerm longNote = (LongTerm) note;
                text = longNote.toString();
            }
            System.out.println(text + "\n");
            }
    }

}

