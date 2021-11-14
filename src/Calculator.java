public class Calculator {
    private double num1;
    private double num2;
    private double res;

    public Calculator() {
    }

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sum(){
        this.res = this.num1 + this.num2;
    }

    public void dif(){
        this.res = this.num1 - this.num2;
    }

    public void mul(){
        this.res = this.num1 * this.num2;
    }

    public void div(){
        this.res = this.num1 / this.num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
