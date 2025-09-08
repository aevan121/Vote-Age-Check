import java.util.Scanner;
public class ProblemSolveFour_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input age: ");
        int age = scanner.nextInt();
        if(age >= 18){
            System.out.println("You can vote!");
        } else if(age <= 17 && age > 0){
            System.out.println("You are too young to vote!");
        } else{
            System.out.println("You are a time traveller.");
        }



    scanner.close();
    }
}
