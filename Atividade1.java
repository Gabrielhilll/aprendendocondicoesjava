
// Crie uma variável que armazene a idade de uma pessoa
// Verifique se a pessoa é maior de idade (18 anos ou mais).
//Imprima uma mensagem informando se a pessoa é maior de idade ou menor de idade.


import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {


        int idade = 16;

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite o sua idade: ");
        idade = sc.nextInt();


        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("Não é maior de idade");
        }
    }
}
