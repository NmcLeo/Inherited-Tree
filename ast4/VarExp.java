package ast4;

public class VarExp extends Exp {
    private static VarExp theVarExp = null;

    private VarExp (String str){
        super(str);
    }

    public String text(){
        return(super.text());
    }

    public static VarExp instance(String x){
        if(theVarExp == null){
            theVarExp = new VarExp(x);
        }
        return theVarExp;
    }

    public int report(){
        super.count+=1;
        return(super.report());
    }
}
