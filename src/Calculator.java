public class Calculator {
    private double num1;
    private double num2;
    private double res;

    public Calculator() {
    }

    public Calculator(double num1) {
        this.num1 = num1;
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
        if(this.num2 == 0){

            System.err.println("Second number can't be 0!");
            System.exit(0);
            return;
        }

        this.res = this.num1 / this.num2;
    }

    public void isBigger(){
        if(this.num1 > this.num2){
            this.res = 1;
        }
        else {
            this.res = 0;
        }
    }

    public void isSmaller(){
        if(this.num1 < this.num2){
            this.res = 1;
        }
        else {
            this.res = 0;
        }
    }

    public void isBiggerOrEq(){
        if(this.num1 >= this.num2){
            this.res = 1;
        }
        else {
            this.res = 0;
        }
    }

    public void isSmallerOrEq(){
        if(this.num1 <= this.num2){
            this.res = 1;
        }
        else {
            this.res = 0;
        }
    }

    public void fuct(){
        this.res = 1;

        for(int i = 2; i<=this.num1; i++){
            this.res = this.res*i;
        }
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
