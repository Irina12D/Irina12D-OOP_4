import java.util.Calendar;
import java.util.GregorianCalendar;
public class NoteComparator implements java.util.Comparator<Notes> {
    @Override
    public int compare(Notes a, Notes b) {
        DateTime dateA;
        if (a instanceof Current) {
            Current aDate = (Current) a;
            dateA = aDate.getTimeCreated();
        }
        else {
            LongTerm aDate = (LongTerm) a;
            dateA = aDate.getDateCreated();
        }

        DateTime dateB;
        if (b instanceof Current) {
            Current bDate = (Current) b;
            dateB = bDate.getTimeCreated();
        }
        else {
            LongTerm bDate = (LongTerm) b;
            dateB = bDate.getDateCreated();
        }
        Calendar A = new GregorianCalendar(dateA.getYear(), dateA.getMonth(), dateA.getDay());
        Calendar B = new GregorianCalendar(dateB.getYear(), dateB.getMonth(), dateB.getDay());
        return B.compareTo(A);
    }
}
