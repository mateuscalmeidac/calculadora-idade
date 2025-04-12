package DataCalendar;
import java.util.Scanner;
import java.util.Calendar;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar a data de nascimento
        System.out.println("Digite o dia do seu nascimento:");
        int diaNascimento = scanner.nextInt();

        System.out.println("Digite o mês do seu nascimento (1-12):");
        int mesNascimento = scanner.nextInt();

        System.out.println("Digite o ano do seu nascimento:");
        int anoNascimento = scanner.nextInt();

        // Obter a data atual
        Calendar dataAtual = Calendar.getInstance();
        int anoAtual = dataAtual.get(Calendar.YEAR);
        int mesAtual = dataAtual.get(Calendar.MONTH) + 1; // Janeiro = 0, então adicionar 1
        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

        // Calcular a idade
        int idade = anoAtual - anoNascimento;

        // Ajustar a idade se ainda não fez aniversário no ano atual
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--;
        }

        // Exibir a idade
        System.out.println("Sua idade: " + idade + " anos.");

        scanner.close();
    }
}