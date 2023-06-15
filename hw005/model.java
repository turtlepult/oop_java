import i_calc.i_model;

public class model implements i_model {
    String oper;
    Double num_1;
    Double num_2;
    Double result;
    boolean flag = true;
    @Override
    public String action_calc() {
        
        switch (oper) {
            case "+":
                result = num_1 + num_2;
                return result.toString();
            case "-":
                result = num_1 - num_2;
                return result.toString();
            case "*":
                result = num_1 * num_2;
                return result.toString();
            case "/":
                if (num_2 == 0) {
                    System.out.println("на 0 делить нельзя!!!!");
                    
                } else {
                    result = num_1 / num_2;
                    return result.toString();
                }
            
            default:
                System.out.println("что-то тут не так! Попоробуй снова \n");
                break;
        }
        return result.toString();
    }

}
