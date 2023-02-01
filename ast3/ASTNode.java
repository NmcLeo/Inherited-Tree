package ast3;

public interface ASTNode{
    private String text(){
        return("");
    }

    public default int report(){
        return(0);
    }
}