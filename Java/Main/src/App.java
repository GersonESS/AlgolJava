import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Digite o seu nome");
        String user ;
        Scanner reader = new Scanner(System.in);
        user = reader.nextLine();
        System.out.println("Ola, " + user + " seja bem vindo");
    }
}
