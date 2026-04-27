package base.Calculatrice;

public class App {
    public static void main(String[] args) {
        double a=Double.parseDouble(System.console().readLine("Enter le premier nombre: "));
        double b=Double.parseDouble(System.console().readLine("Enter le deuxième nombre: "));
        double result=CaculatriceService.addition(a, b);
        System.out.println("Le résultat de l'addition est: " + result);
    }
}
