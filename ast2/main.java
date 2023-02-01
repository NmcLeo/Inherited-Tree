package ast2;

public class main {

    public static Exp makeExp(Number num){
        return new NumericLiteral(num);
    }
    public Exp makeExp(String str){
        return new StringLiteral(str);
    }
    public static PlusExp makeExp(Exp left, Exp right){
        return new PlusExp(left, right);
    }
    public static Stmt makeStat(String str){
        return new DeclStmt(str);
    }
    public static Stmt makeStat(String str, Exp exp){
        return new Assignment(str, exp);
    }
    public static Stmt makeStat(Stmt stmt1, Stmt stmt2){
        return new Sequence(stmt1, stmt2);
    }

    public static void main(String args[]){  
        Exp one=makeExp(1);
        Exp three=makeExp(3);
        PlusExp exp=makeExp(one,three);
        Stmt decl=makeStat("x");
        Stmt assign=makeStat("x",exp);
        Stmt seq=makeStat(decl,assign);
    
        System.out.println(seq.text());
    }  
     
}
