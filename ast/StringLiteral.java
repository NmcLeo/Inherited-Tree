package ast;

public class StringLiteral extends Literal {

    public StringLiteral(String str){
        super(str);
    }
    public String text(){
        return(super.text());
    }
}
