import java.util.Scanner;

public class ProgramaStudent{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Criando aluno
        Student aluno = new Student();

        System.out.println("Aluno: ");
        aluno.name = scanner.nextLine();

        System.out.println("Nota do primeiro trismestre: ");
        aluno.grade1 = scanner.nextDouble();

        System.out.println("Nota do segundo trismestre: ");
        aluno.grade2 = scanner.nextDouble();

        System.out.println("Nota do terceiro trismestre: ");
        aluno.grade3 = scanner.nextDouble();
        
        
        System.out.println(aluno.checking());
        System.out.println(aluno.message());

        




    }
}