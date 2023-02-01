package ast;

public class VarExp extends Exp {

    public VarExp (Exp left){
        super(left.value);
    }

    public String text(){
        return(super.text());
    }
}
