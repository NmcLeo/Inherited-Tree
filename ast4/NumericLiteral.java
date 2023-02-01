package ast4;

public class NumericLiteral extends Literal {

    private static NumericLiteral theNumericLiteral = null;

    private NumericLiteral(Number num){
        super(String.valueOf(num));
    }

    public String text(){
        return(super.text());
    }

    public static NumericLiteral instance(Number num){
        if(theNumericLiteral == null){
            theNumericLiteral = new NumericLiteral(num);
        }
        return theNumericLiteral;
    }

    public int report(){
        super.count+=1;
        return(super.report());
    }
}
