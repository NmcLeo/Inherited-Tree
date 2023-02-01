package ast3;

public class VarExp extends Exp {

    public VarExp (String str){
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
