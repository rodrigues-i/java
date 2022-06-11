import java.util.Scanner;

public class DesafioCalculadora {
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digita o primeiro número: ");
    double num1 = Double.parseDouble(entrada.next());

    System.out.println("Digita o segundo número: ");
    double num2 = Double.parseDouble(entrada.next());

    System.out.println("Digita a operação: ");
    String operacao = entrada.next();
    
    var resultado = operacao.equals("+") ? 
      num1 + num2 : operacao.equals("-") ? 
      num1 - num2 : operacao.equals("*") ? 
      num1 * num2 : operacao.equals("/") ? 
      num1 / num2 : operacao.equals("%") ? 
      num1 % num2 : false;

    System.out.println(resultado);

    entrada.close();

    // System.out.println(args[0]); Imprime o argumento que é passdo quando ao executar um arquivo usando o comando java seguido pelo nome do arquivo
  }
}
