package ast4;

public class StringLiteral extends Literal {
    private static StringLiteral theStringLiteral = null;

    private StringLiteral(String str){
        super(str);
    }
    public String text(){
        return(super.text());
    }

    public static StringLiteral instance(String x){
        if(theStringLiteral == null){
            theStringLiteral = new StringLiteral(x);
        }
        return theStringLiteral;
    }

    public int report(){
        super.count+=1;
        return(super.report());
    }
}
