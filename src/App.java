import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String adjective, noun, verb, name;

    System.out.print("Enter an adjective: ");
    adjective = scanner.nextLine();
    System.out.print("Enter a noun: ");
    noun = scanner.nextLine();
    System.out.print("Enter a verb: ");
    verb = scanner.nextLine();
    System.out.print("Enter a name: ");
    name = scanner.nextLine();

    System.out.println("Upon seeing the "+adjective+" "+noun);
    System.out.println(name+" couldn't believe what happened to the "+verb+" "+noun);

    scanner.close();
  }
}
