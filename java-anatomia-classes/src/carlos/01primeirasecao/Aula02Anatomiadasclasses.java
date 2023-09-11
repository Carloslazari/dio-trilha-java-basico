package carlos.primeirasecao;

public class Aula02Anatomiadasclasses {
    public static void main (String[] args) {
        String primeiroNome = "Carlos";
                String segundoNome = "Eduardo";

                String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
                System.out.println(nomeCompleto);

    }

            public static String nomeCompleto(String primeiroNome, String segundoNome){
                return "Resultado do metodo " + primeiroNome.concat(" ").concat(segundoNome);
            }

    
}




        /*
         * tipo NomeBemDefinido = Atribuição (Opcional em alguns casos)
         * 
         * Ex:
         
        String meuNome ="Carlos";

        int anoFabricacao = 2022;

        boolean verdadeira = true;

        boolean falsa = false;

        anoFabricacao = 2018;
_________________________________________________________________

        //Estrutura

        METODOS

        tipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

        // Ex:


        int somar(int numeroUm, int numero2);

        String formatarCep (long cep);

        */