import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        int pagestoread = 100 - age;
        System.out.println(age + "-year olds should read " + pagestoread + " pages before giving up.");

    }
}
