import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isHolyday = false;

        List<Holyday> holydays = new ArrayList<>();
        holydays.add(new Holyday("Confraternização mundial", "01/01/2023"));
        holydays.add(new Holyday("Carnaval", "21/02/2023"));
        holydays.add(new Holyday("Páscoa", "17/04/2023"));
        holydays.add(new Holyday("Tiradentes", "21/04/2023"));
        holydays.add(new Holyday("Dia do trabalho", "01/05/2023"));
        holydays.add(new Holyday("Corpus Christi", "08/06/2023"));
        holydays.add(new Holyday("Independência do Brasil", "07/09/2023"));
        holydays.add(new Holyday("Nossa Senhora Aparecida", "12/10/2023"));
        holydays.add(new Holyday("Finados", "02/11/2023"));
        holydays.add(new Holyday("Proclamação da República", "15/11/2023"));
        holydays.add(new Holyday("Natal", "25/12/2023"));

        Scanner firstInput = new Scanner(System.in);
        System.out.println("Insira o número: 1 - para fornecer uma data e obter um feriado; qualquer outro - para obter todos os feriados do ano.");
        int option = firstInput.nextInt();

        if (option == 1) {
            Scanner secondInput = new Scanner(System.in);
            System.out.println("Insira a data  (dd/mm/aaaa) para saber qual feriado é:");
            String date = secondInput.next();

            System.out.println();

            for (int i = 0; i < holydays.size(); i++) {

                if (date.equals(holydays.get(i).getDate())) {
                    System.out.println("Feriado: " + holydays.get(i).getName());
                    isHolyday = true;
                }

            }

            if (!isHolyday) {
                System.out.println("Essa data não é um Feriado!");
            }

        } else {

            for (int i = 0; i < holydays.size(); i++) {
                System.out.println(holydays.get(i).getDate() + " - " + holydays.get(i).getName());
            }
            
        }
    }
}
