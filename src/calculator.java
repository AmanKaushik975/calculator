public class calculator {
    double num1;
    double num2;

    public calculator(int x , int y){
        num1 = x;
        num2 = y;
    }

    public double add(){
        return num1 +  num2;

    }

    public double subtract(){
        return num2 - num1;
    }

    public double divide(){
        return num2 / num1;
    }

    public double multiply(){
        return num1 * num2;
    }

}
