package ast3;

public class main {
    public static void main(String args[]){  
        Exp one=new NumericLiteral(1);
        Exp three=new NumericLiteral(3);
        PlusExp exp=new PlusExp(one,three);
        Stmt decl=new DeclStmt("x");
        Stmt assign=new Assignment("x",exp);
        Stmt seq=new Sequence(decl,assign);

        System.out.println(seq.text());
        seq.report();
        decl.report();
        exp.report();
    }  
     
}
