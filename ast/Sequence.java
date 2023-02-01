package ast;

public class Sequence extends Stmt {
    public Sequence(Stmt stmt1, Stmt stmt2){
        super(stmt1.text() + "; " + stmt2.text());
    }
    public String text(){
        return(super.text());
    }
}
