import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Введите 5 чисел:");
        for (int i = 0; i < 5; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        if (numbers.size() > 1) {
            System.out.println("Yes");
        }



Set<String> workDays = new HashSet<>();
        workDays.add("понедельник");
        workDays.add("вторник");
        workDays.add("среда");
        workDays.add("четверг");
        workDays.add("пятница");

        Set<String> weekendDays = new HashSet<>();
        weekendDays.add("суббота");
        weekendDays.add("воскресенье");

        System.out.println("Введите день недели:");
        scanner.nextLine();
        String day = scanner.nextLine().toLowerCase();

        if (workDays.contains(day)) {
            System.out.println("Рабочий день");
        } else if (weekendDays.contains(day)) {
            System.out.println("Выходной день");
        } else {
            System.out.println("Ошибка");
        }
    }
}



