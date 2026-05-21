import java.util.ArrayList;
import java.util.Scanner;

void main() {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Integer> numbers = new ArrayList<>();

    System.out.print("Введіть розмір списку: ");
    int size = scanner.nextInt();

    System.out.println("Введіть елементи списку:");

    for (int i = 0; i < size; i++) {
        System.out.print("Елемент " + (i + 1) + ": ");
        numbers.add(scanner.nextInt());
    }

    System.out.print("Введіть кількість зсувів N: ");
    int n = scanner.nextInt();

    n = n % size;

    System.out.println("\nПочатковий список:");
    System.out.println(numbers);

    for (int i = 0; i < n; i++) {

        int last = numbers.get(numbers.size() - 1);

        numbers.remove(numbers.size() - 1);

        numbers.add(0, last);
    }

    System.out.println("\nСписок після циклічного зсуву вправо:");
    System.out.println(numbers);
}
