import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Holyday> holidays = new ArrayList<>();
        holidays.add(new Holyday("01/01/2023", "Confraternização mundial"));
        holidays.add(new Holyday("21/02/2023", "Carnaval"));
        holidays.add(new Holyday("17/04/2023", "Páscoa"));
        holidays.add(new Holyday("21/04/2023", "Tiradentes"));
        holidays.add(new Holyday("01/05/2023", "Dia do trabalho"));
        holidays.add(new Holyday("08/06/2023", "Corpus Christi"));
        holidays.add(new Holyday("07/09/2023", "Independência do Brasil"));
        holidays.add(new Holyday("12/10/2023", "Nossa Senhora Aparecida"));
        holidays.add(new Holyday("02/11/2023", "Finados"));
        holidays.add(new Holyday("15/11/2023", "Proclamação da República"));
        holidays.add(new Holyday("25/12/2023", "Natal"));

        Scanner firstInput = new Scanner(System.in);
        System.out.println("Insira 1, para fornecer uma data e obter um feriado.");
        System.out.println("Ou insira 2 para fornecer uma data e obter um feriado.");
        int option = firstInput.nextInt();

        if (option == 1) {
            Scanner secondInput = new Scanner(System.in);
            System.out.println("Insira a data para saber qual feriado é:");
            String date = secondInput.next();

        }
    }
}
