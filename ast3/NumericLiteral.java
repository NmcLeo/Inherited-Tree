package ast3;

public class NumericLiteral extends Literal {

    public NumericLiteral(Number num){
        super(String.valueOf(num));
    }

    public String text(){
        return(super.text());
    }

    public int report(){
        super.count+=1;
        return(super.report());
    }
}
