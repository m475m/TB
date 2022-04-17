import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Lesson4Ex1 {
    public static void main(String[] args) throws ParseException {
        ArrayList<String> list = new ArrayList<>();

        list.add("Среда разработки");
        list.add("Основы ООП и базовые знания Java");
        list.add("Поток управления");

        String date = "17.04.2022";
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(date));

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + " " + sdf.format(calendar.getTime()));
            calendar.add(Calendar.DATE, 7);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
