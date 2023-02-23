import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.setCurrentNote(23,02, 18, 55, "Семинар по ООП", 2, true);
        myCalendar.setCurrentNote(23,02, 22, 00, "Выслать задание по Заметкам", 2, false);

        myCalendar.setCurrentNote(24,02, 07, 00, "Утренняя пробежка", 1, false);
        myCalendar.setCurrentNote(24,02, 05, 50, "Утренняя тренировка", 3, false);

        myCalendar.setCurrentNote(6,03, 10, 00, "Подарки на 8 марта", 1, true);
        myCalendar.setCurrentNote(8,03, 8, 00, "Сегодня праздник", 4, false);

        myCalendar.setCurrentNote(12,4, 07, 00, "Утренняя пробежка", 1, false);
        myCalendar.setCurrentNote(24,4, 05, 50, "Утренняя тренировка", 3, false);

        myCalendar.setLongTermNote(24, 2,2023, 26, 2, 2023, "Отдых", "поехать в горы на выходные",2,false);
        myCalendar.setLongTermNote(26, 2,2023, 28, 2, 2023, "Задания", "доделать семинарские задания",1,false);

        myCalendar.printCalendar();

    }

}
