public class Calculator {
    private double number1;
    private double number2;

    public Calculator(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add(){
        double sum = this.number1 + this.number2;
        return sum;
    }

    public double subtract(){
        double result = this.number1 - this.number2;
        return result;
    }

    public double multiply(){
        double result = this.number1 * this.number2;
        return result;
    }

    public double divide(){
        double result = this.number1 / this.number2;
        return result;
    }


}
