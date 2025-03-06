import java.util.Scanner;
public class test {
public static void main(String[] args) {
    Scanner sce = new Scanner(System.in);
    System.out.println("Enter item type(E for Essential and N for Non Essential): ");
    String type = sce.nextLine();
    System.out.println(type.getClass().getName());
    if(!type.toLowerCase().equals("e") && !type.toLowerCase().equals("n")) {
        System.out.println("Enter wrong type. Please try again.");
    }
    else {
        System.out.println("Enter correct type.");  
    }
    sce.close();
}
}
