package ast3;

public class DeclStmt extends Stmt {
    public DeclStmt(String str){
        super(str);
    }
    public String text(){
        return("var " + statement);
    }

    public int report(){
        super.count+=1;
        return(super.report());
    }
}
