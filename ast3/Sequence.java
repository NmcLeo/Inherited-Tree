package ast3;

public class Sequence extends Stmt {
    public Sequence(Stmt stmt1, Stmt stmt2){
        super(stmt1.text() + "; " + stmt2.text());
    }

    public String text(){
        return(super.text());
    }

    public int report(){
        super.count+=3;
        return(super.report());
    }
}
