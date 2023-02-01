package ast4;

public class main {
    public static void main(String args[]){  
        Exp one=NumericLiteral.instance(1);
        Exp three= StringLiteral.instance("3");
        PlusExp exp=PlusExp.instance(one,three);
        Stmt decl=DeclStmt.instance("x");
        Stmt assign=Assignment.instance("x",exp);
        Stmt seq=Sequence.instance(decl,assign);

        System.out.println(seq.text());
    }  
     
}
