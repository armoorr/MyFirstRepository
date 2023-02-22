import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        var help = new Helpfull_file();
        System.out.println("Hello, user!");
        help.help(scan.nextLine());
    }
}
