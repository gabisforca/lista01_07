import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double lado;
    double area;
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o lado do quadrado");
    lado = teclado.nextDouble();
    
    // passo 3: calcular salario
    area = (lado * lado) * 2;
    // passo 4: exibir salario 
    System.out.println("o dobro da área do quadrado é:" + area);
  }
}