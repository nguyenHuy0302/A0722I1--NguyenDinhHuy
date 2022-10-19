package ss4_Class_and_Object.BaiTap.XayDungLopQuadraticequation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(){
    }
public QuadraticEquation(double a , double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
}
public double getA(){
        return a;
}
public double getB(){
        return b;
}
public double getC(){
        return c;
}
public void setA(double a){
        this.a =a;
}
    public void setB(double b){
        this.b =b;
    }
    public void setC(double c){
        this.c =c;
    }
    public double getDiscriminant(){
        return this.b * this.b -4 * this.a * this.c;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant()) / 2 / this.a);
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant()) / 2 / this.a);
    }
    public String getResult(){
        if (getDiscriminant() <0 ) return " The equation has to root";
        else  if (getDiscriminant() == 0 ) return " one root : "+ getRoot1();
        else return "Two root :" + getRoot1() + " and " + +getRoot2();
    }
    public String toString(){
        return " QuadraticEquaion {" + this.a +" ,"+this.b+","+this.c+"} "+" " + getResult();
    }
}
