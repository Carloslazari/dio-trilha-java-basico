// ResultadoEscolar.java

import java.util.Scanner;
import java.util.Locale;

public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite uma nota ");
            int nota = sc.nextInt();

            String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota<7 ? "Recuperação" :  "Reprovado";
            
            System.out.println(resultado);
        }
        
    }
}