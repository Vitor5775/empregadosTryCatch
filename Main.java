import java.util.Scanner;

public class Main {
public static void main(String[] args) {
try {

 Scanner sc = new Scanner(System.in);
System.out.println("Digite o nome do primeiro empregado: ");
String nome = sc.nextLine();
System.out.println("Digite o sobrenome do primeiro empregado: ");
String sobrenome = sc.nextLine();
System.out.println("Digite o salário mensal do primeiro empregado: ");
int salario = sc.nextInt();
sc.nextLine(); 

System.out.println("Digite o nome do segundo empregado: ");
String nome2 = sc.nextLine();
System.out.println("Digite o sobrenome do segundo empregado: ");
String sobrenome2 = sc.nextLine();
System.out.println("Digite o salário mensal do segundo empregado: ");
int salario2 = sc.nextInt();

empregados empregado = new empregados(nome, sobrenome, salario, nome2, sobrenome2, salario2);
System.out.println("Salário anual do primeiro empregado: " + empregado.salario_anual());
System.out.println("Salário anual do segundo empregado: " + empregado.salario_anual2());
System.out.println("Aumento do primeiro empregado: " + empregado.aumento());
System.out.println("Aumento do segundo empregado: " + empregado.aumento2());

} catch (java.util.InputMismatchException e) {
System.out.println("Erro de entrada. Certifique-se de inserir o tipo de dado correto.");
} catch (java.util.NoSuchElementException e) {
System.out.println("Elemento não encontrado. Certifique-se de fornecer todas as informações necessárias.");
} catch (Exception e) {
System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}