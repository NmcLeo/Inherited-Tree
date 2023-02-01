package ast4;

public class Exp implements ASTNode{
    protected String value; 
    protected int count;

    public Exp(String str){
        this.value = str;
    }

    protected String text(){
        return value;
    }

    public int report(){
        System.out.println(count + " Exp node created. ");
        return(count);
    }
}
