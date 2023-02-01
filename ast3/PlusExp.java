package ast3;

public class PlusExp extends Exp{
    public String addedvalue;

    public PlusExp (Exp left, Exp right){
        super(left.value);
        addedvalue = right.value;
    }
    
    public String text(){
        return(super.text() + " + " + addedvalue);
    }

    public int report(){
        super.count +=2;
        return(super.report());
    }
}