package ast3;

public class Literal extends Exp {

    public Literal(String liter){
        super(liter);
    }
    public String text(){
        return(super.text());
    }

    public int report(){
        super.count+=1;
        return(super.report());
    }
}
