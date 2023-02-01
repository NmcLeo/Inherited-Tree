package ast2;

public class DeclStmt extends Stmt {
    public DeclStmt(String str){
        super(str);
    }
    public String text(){
        return("var " + statement);
    }
}
