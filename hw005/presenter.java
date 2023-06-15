

import i_calc.i_presenter;

public class presenter implements i_presenter {
    public static void main(String[] args) {
        View input_data = new View();
        model actModel = new model();
        boolean flag = true;
        
        while (flag) {
        actModel.num_1 = input_data.import_num_1();
        actModel.num_2 = input_data.import_num_2();
        actModel.oper = input_data.message_operation();
        System.out.println("Результат соствавил: "+actModel.action_calc());
        
        }
        
    }
}