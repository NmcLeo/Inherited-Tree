package ast4;

public class PlusExp extends Exp{
    public String addedvalue;
    private static PlusExp thePlusExp = null;

    private PlusExp (Exp left, Exp right){
        super(left.value);
        addedvalue = right.value;
    }
    
    public String text(){
        return(super.text() + " + " + addedvalue);
    }

    public static PlusExp instance(Exp left, Exp right){
        if(thePlusExp == null){
            thePlusExp = new PlusExp(left, right);
        }
        return thePlusExp;
    }

    public int report(){
        super.count +=2;
        return(super.report());
    }
}