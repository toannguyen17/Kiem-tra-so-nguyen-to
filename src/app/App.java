package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        checkNumber();
    }

    public static void checkNumber(){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            double number = scanner.nextDouble();

            while (number < 2) {
                System.out.println("Vui lòng nhập số nguyên lớn hơn 2.");
                System.out.print("Enter a number: ");
                number = scanner.nextDouble();
            }
            if(number == 2){
                System.out.print(number + " là số nguyên tố.");
            }else{
                double c50 = Math.ceil(number/2);
                boolean isSNT = true;
                for(int i = 2; i <= c50; i++){
                    if (number%i == 0) {
                        isSNT = false;
                    }
                }

                if(isSNT){
                    System.out.print((int)number + " là số nguyên tố.");
                }else{
                    System.out.print((int)number + " không phải số nguyên tố.");
                }
            }

        } catch (Exception e) {
            System.out.println("Vui lòng nhập số nguyên.");
            checkNumber();
        }
    }
}
