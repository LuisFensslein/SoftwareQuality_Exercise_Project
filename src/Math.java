public class Math {

    public static void main(String[] args) {
    }
    public Math() {}
    public int method_for_Excercise01(int x, String ops, int y){
        int result=0;

        if (ops == "plus" || ops =="minus"|| ops =="multiply"|| ops =="divide"){

            if (ops == "plus"){
                result = x+y;
            }
            else if (ops == "minus"){
                result = x-y;
            }
            else if (ops == "multiply"){
                result = x*y;
            }
            else{
                result = x/y;
            }
            System.out.println(result);
        }
        else{
            System.out.println("Please try again");
        }
        return result;
    }
}
