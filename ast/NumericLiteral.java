package ast;

public class NumericLiteral extends Literal {

    public NumericLiteral(Number num){
        super(String.valueOf(num));
    }

    public String text(){
        return(super.text());
    }
}
