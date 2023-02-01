package ast4;

public class DeclStmt extends Stmt {
    private static DeclStmt theDeclStmt = null;

    private DeclStmt(String str){
        super(str);
    }
    public String text(){
        return("var " + statement);
    }

    public static DeclStmt instance(String x){
        if(theDeclStmt == null){
            theDeclStmt = new DeclStmt(x);
        }
        return theDeclStmt;
    }

    public int report(){
        super.count+=1;
        return(super.report());
    }
}
