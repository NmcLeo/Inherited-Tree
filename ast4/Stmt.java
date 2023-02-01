package ast4;

public class Stmt implements ASTNode {
    protected String statement; 
    protected int count;

    public Stmt(String str){
        this.statement = str;
    }
    public String text(){
        return(statement);
    }

    public int report(){
        System.out.println(this.count + " Stmt Node created.");
        return(count);
    }
}
