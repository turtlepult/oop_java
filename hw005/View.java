
import java.util.Scanner;

import i_calc.i_view;

public class View implements i_view { 

    Scanner scanner = new Scanner(System.in);
    @Override
    public Double import_num_1() {
        System.out.println("Введите первое число: ");
        Double num_1 = scanner.nextDouble();
        return num_1;
    }
    @Override
    public Double import_num_2(){
        System.out.println("Введите второе число: ");
        Double num_2 = scanner.nextDouble();
        return num_2;
    }
    

    @Override 
    public String message_operation(){
        System.out.println("Введите оператор +, - , * ,/: ");
        String oper = scanner.next();
        return oper;
    }
}
