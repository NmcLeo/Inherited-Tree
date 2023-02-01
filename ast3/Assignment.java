package ast3;

public class Assignment extends Stmt {
    private Exp exp;

    public Assignment(String x, Exp exp){
        super(x);
        this.exp = exp;
    }

    public String text(){
        return(super.text() + " = " + this.exp.text());
    }

    public int report(){
        super.count= super.count + 1;
        return(super.report());
    }
}
