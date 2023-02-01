package ast3;

public class StringLiteral extends Literal {

    public StringLiteral(String str){
        super(str);
    }
    public String text(){
        return(super.text());
    }

    public int report(){
        super.count+=1;
        return(super.report());
    }
}
