import java.util.Scanner;

public class TestMain {


    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int quantAlunos;
        float med, maxMed= 0, minMed = 10, notaP, notaS, medTotal = 0 , medShow = 0;


        System.out.println("Digite a quantidade de alunos: ");
        quantAlunos = input.nextInt();


        for(int count = 0 ; count < quantAlunos ; count ++){
            System.out.print("\nDigite a Primeira nota do aluno:");
            notaP = input.nextFloat();
            System.out.print("Digite a Segunda nota do aluno:");
            notaS = input.nextFloat();

            med = (notaP + notaS)/2;

            medTotal = med + med;


            if ( med < minMed  ) {
                minMed = med;
            }else if (med > maxMed){
                maxMed = med;
            }

            medShow = medTotal / quantAlunos;

        }
        System.out.println("\nA menor nota média é: " + minMed);
        System.out.println("A maior nota mádia é: " + maxMed);
        System.out.println("A nota média dos "+ quantAlunos +" alunos é: " + medShow);
    }
}
