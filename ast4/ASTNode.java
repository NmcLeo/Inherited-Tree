package ast4;

public interface ASTNode{
    private String text(){
        return("");
    }

    public default int report(){
        return(0);
    }
}