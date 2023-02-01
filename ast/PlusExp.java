package ast;

public class PlusExp extends Exp{
    public String addedvalue;

    public PlusExp (Exp left, Exp right){
        super(left.value);
        addedvalue = right.value;
    }
    
    public String text(){
        return(super.text() + " + " + addedvalue);
    }
}