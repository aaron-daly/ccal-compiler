import java.util.*;

public class PrintVisitor implements CCALParserVisitor {
    public Object visit(SimpleNode node, Object data) {
        throw new RuntimeException("Visit SimpleNode");
    }

    public Object visit(ASTPROG node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        System.out.println(";");
        return data;
    }
    public Object visit(ASTdeclList node, Object data) {
        return data;
    }

    public Object visit(ASTdecl node, Object data) {
        return data;
    }

    public Object visit(ASTVAR_DECL node, Object data) {
        System.out.print(node.value + " ");
        node.jjtGetChild(0).jjtAccept(this, data);
        return data;
    }

    public Object visit(ASTCONST_DECL node, Object data) {
        System.out.print(node.value + " ");
        node.jjtGetChild(0).jjtAccept(this, data);
        return data;
    }

    public Object visit(ASTfuncList node, Object data) {
        return data;
    }

    public Object visit(ASTfunc node, Object data) {
        return data;
    }

    public Object visit(ASTtype node, Object data) {
        return data;
    }

    public Object visit(ASTparamList node, Object data) {
        return data;
    }

    public Object visit(ASTparam node, Object data) {
        return data;
    }

    public Object visit(ASTmain node, Object data) {
        return data;
    }

    public Object visit(ASTstmBlock node, Object data) {
        return data;
    }

    public Object visit(ASTstm node, Object data) {
        return data;
    }

    public Object visit(ASTexp node, Object data) {
        return data;
    }

    public Object visit(ASTfrag node, Object data) {
        return data;
    }

    public Object visit(ASTrecurExp node, Object data) {
        return data;
    }

    public Object visit(ASTbinOp node, Object data) {
        return data;
    }

    public Object visit(ASTcond node, Object data) {
        return data;
    }

    public Object visit(ASTsimpleCond node, Object data) {
        return data;
    }

    public Object visit(ASTrecurCond node, Object data) {
        return data;
    }

    public Object visit(ASTandOrOp node, Object data) {
        return data;
    }

    public Object visit(ASTcompOp node, Object data) {
        return data;
    }

    public Object visit(ASTargList node, Object data) {
        return data;
    }

    public Object visit(ASTidentifier node, Object data) {
        return data;
    }
}