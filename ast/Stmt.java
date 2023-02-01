package ast;

public class Stmt implements ASTNode {
    protected String statement; 

    public Stmt(String str){
        this.statement = str;
    }
    public String text(){
        return(statement);
    }
}
