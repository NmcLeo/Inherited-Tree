package ast2;

public class Exp implements ASTNode{
    protected String value; 

    public Exp(String str){
        this.value = str;
    }
    protected String text(){
        return value;
    }
}
