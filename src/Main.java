import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

//    String descricao = "nicolas@emailxpto.com";
    String descricao = "Esse é o email do nicolas@emailxpto.com";

    // Cria um regex
    Pattern buscaEmailPattern = Pattern.compile("\\w+@\\w+.\\w+");

    // Cria uma Classe Matcher onde você pode manipular varias coisas dentro dela.
    Matcher matcher = buscaEmailPattern.matcher(descricao);

    System.out.println();
    System.out.println("=== Descrição inicial informada ===");
    System.out.println(descricao);
    System.out.println();
    System.out.println("=== Verificando se encontrou um email dentro da descrição ===");
    // Verifica se encontrou um email na 'descricao'
    if(matcher.find()) {
      // Imprime o email encontrado a partir da 'descricao'
      System.out.printf("E-mail encontrado: %s", matcher.group());
    }

    System.out.println();
    System.out.println();
    System.out.println("=== Verificando se existe somente e-mail na descrição informada ===");
    if(matcher.matches()) {
      System.out.printf("Só existe e-mail e o e-mail encontrado foi: %s", descricao);
    } else {
      System.out.printf("a descrição informada não possui apenas e-mail, descrição informada: %n %s", descricao);
    }

    matcher.reset();
    if(matcher.find()) {
    System.out.println();
    System.out.println("=== Verificando em que posição que encontrei o email ===");
    System.out.printf("""
        Email encontrado: %s
        Início: %d
        Fim: %d
        """, matcher.group(), matcher.start(), matcher.end());
    }
  }
}
