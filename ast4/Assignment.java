package ast4;

public class Assignment extends Stmt {
    private Exp exp;

    private static Assignment theAssignment = null;
    private Assignment(String x, Exp exp){
        super(x);
        this.exp = exp;
    }

    public static Assignment instance(String x, Exp exp){
        if(theAssignment == null){
            theAssignment = new Assignment(x, exp);
        }
        return theAssignment;
    }

    public String text(){
        return(super.text() + " = " + this.exp.text());
    }

    public int report(){
        super.count= super.count + 1;
        return(super.report());
    }
}
