import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = 1;
            String ya = "Y";

            while(ya.equals("Y")){
                System.out.println(a+ " Yutase");
                a++;
                System.out.print("Mau Lanjut Y/N ?\t:");

                ya=sc.nextLine();
                if(ya=="N"){
                    break;
                }
            }
        } 
    }
}
