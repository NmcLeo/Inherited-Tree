package ast4;

public class Sequence extends Stmt {
    private static Sequence theSequence = null;

    private Sequence(Stmt stmt1, Stmt stmt2){
        super(stmt1.text() + "; " + stmt2.text());
    }

    public static Sequence instance(Stmt stmt1, Stmt stmt2){
        if(theSequence == null){
            theSequence = new Sequence(stmt1, stmt2);
        }
        return theSequence;
    }

    public String text(){
        return(super.text());
    }

    public int report(){
        super.count+=3;
        return(super.report());
    }
}
