public class formatadorCepExemplo{
public static void main(String[] args) {
        String cepformatado = formatarCep("23765064")

}
        static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)

          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
    }

    