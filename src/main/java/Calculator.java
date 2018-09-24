public class Calculator {
    private int number1;
    private int number2;

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add(){
        int sum = this.number1 + this.number2;
        return sum;
    }

    public int subtract(){
        int result = this.number1 - this.number2;
        return result;
    }

    public int multiply(){
        int result = this.number1 * this.number2;
        return result;
    }

    public int divide(){
        int result = this.number1 / this.number2;
        return result;
    }


}
