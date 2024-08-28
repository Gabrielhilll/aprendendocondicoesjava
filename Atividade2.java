import java.util.Scanner;

public class Atividade2 {


public static void main(String[] args) {
    System.out.println("digite sua nota");
    double nota = 0;

    Scanner sc = new Scanner(System.in);
     nota = sc.nextDouble();
     String  classificacao = "";

    if (nota >= 9) {
        classificacao = "Excelente";
    } else if (nota >= 7) {
        classificacao = "Bom";
    } else if (nota >= 5) {
        classificacao = "Satisfatório";
    } else if (nota < 5) {
        classificacao = "Insatisfatório";
    }


    System.out.println("A classificação do aluno é "+ classificacao + " Com a nota " + nota);



}


}