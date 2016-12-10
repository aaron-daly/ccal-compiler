class PrintVisitor implements CCALParserVisitor {
    public Object visit(SimpleNode node, Object data) {
        throw new RuntimeException("Visit SimpleNode");
    }
    public Object visit(ASTPROG node, Object data) {
        node.childrenAccept(this, data);
        return data;
    }

    public Object visit(ASTvarDecl node, Object data) {
        System.out.print("var ");
        node.jjtGetChild(0).jjtAccept(this, data); // identifier
        System.out.print(':');
        node.jjtGetChild(1).jjtAccept(this, data); // type
        System.out.println(';');
        return data;
    }

    public Object visit(ASTconstDecl node, Object data) {
        System.out.print("const ");
        node.jjtGetChild(0).jjtAccept(this, data); // identifier
        System.out.print(':');
        node.jjtGetChild(1).jjtAccept(this, data); // type
        System.out.print(" = ");
        node.jjtGetChild(2).jjtAccept(this, data); // value
        System.out.println(';');
        return data;
    }

    public Object visit(ASTbinOpExp node, Object data) {
        node.childrenAccept(this, data);
        return data;
    }

    public Object visit(ASTfunc node, Object data) {
        for (int i = 0; i < node.jjtGetNumChildren(); i++) {
            node.jjtGetChild(i).jjtAccept(this, data);
            System.out.print(" ");
        }
        System.out.println();
        return data;
    }

    public Object visit(ASTfuncBlock node, Object data) {
        System.out.println("{");
        for (int i = 0; i < node.jjtGetNumChildren(); i++) {
            node.jjtGetChild(i).jjtAccept(this, data);
        }

        System.out.println("}");
        return data;
    }

    public Object visit(ASTfuncReturn node, Object data) {
        System.out.print("return (");
        node.jjtGetChild(0).jjtAccept(this, data);
        System.out.println(");");
        return data;
    }

    public Object visit(ASTtype node, Object data) {
        System.out.print(node.value);
        return data;
    }

    public Object visit(ASTparamList node, Object data) {
        System.out.print("(");
        node.jjtGetChild(0).jjtAccept(this, data);
        for (int i = 1; i < node.jjtGetNumChildren(); i++) {
            System.out.print(", ");
            node.jjtGetChild(i).jjtAccept(this, data);
        }
        System.out.println(")");
        return data;
    }

    public Object visit(ASTparam node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        System.out.print(":");
        node.jjtGetChild(1).jjtAccept(this, data);
        return data;
    }

    public Object visit(ASTmain node, Object data) {
        System.out.println("main");
        System.out.println('{');
        node.childrenAccept(this, data);
        System.out.println('}');
        return data;
    }
    public Object visit(ASTassign node, Object data) {
        node.jjtGetChild(0).jjtAccept(this, data);
        System.out.print(" = ");
        node.jjtGetChild(1).jjtAccept(this, data);
        System.out.println(";");
        return data;
    }

    public Object visit(ASTfuncCall node, Object data) {
        System.out.println("funcCall");
        return data;
    }

    public Object visit(ASTargList node, Object data) {
        System.out.print('(');
        node.jjtGetChild(0).jjtAccept(this, data);
        for (int i = 1; i < node.jjtGetNumChildren(); i++) {
            System.out.print(", ");
            node.jjtGetChild(i).jjtAccept(this, data);
        }
        System.out.print(')');
        return data;
    }
    public Object visit(ASTstmSkip node, Object data) {
        System.out.println("skip;");
        return data;
    }

    public Object visit(ASTifBlock node, Object data) {
        System.out.print("if ");
        node.jjtGetChild(0).jjtAccept(this, data);
        System.out.println('{');
        for (int i = 1; i < node.jjtGetNumChildren(); i++)
            node.jjtGetChild(i).jjtAccept(this, data);
        System.out.println('}');
        return data;
    }
    public Object visit(ASTelseBlock node, Object data) {
        System.out.println("else");
        System.out.println('{');
        node.childrenAccept(this, data);
        System.out.println('}');
        return data;
    }

    public Object visit(ASTwhileBlock node, Object data) {
        System.out.print("while ");
        node.jjtGetChild(0).jjtAccept(this, data);
        System.out.println('{');
        for (int i = 1; i < node.jjtGetNumChildren(); i++)
            node.jjtGetChild(i).jjtAccept(this, data);
        System.out.println('}');
        return data;
    }
    public Object visit(ASTparenExp node, Object data) {
        System.out.println("parenExp");
        return data;
    }

    public Object visit(ASTnegIdentifier node, Object data) {
        System.out.print("-");
        node.jjtGetChild(0).jjtAccept(this, data);
        return data;
    }

    public Object visit(ASTnum node, Object data) {
        System.out.print(node.value);
        return data;
    }

    public Object visit(ASTbool node, Object data) {
        System.out.print(node.value);
        return data;
    }
    public Object visit(ASTbinOp node, Object data) {
        System.out.print(node.value);
        return data;
    }
    public Object visit(ASTnotCond node, Object data) {
        System.out.print("~" + node.value);
        return data;
    }
    public Object visit(ASTparenCond node, Object data) {
        System.out.println("parenCond");
        return data;
    }
    public Object visit(ASToperatorCond node, Object data) {
        node.childrenAccept(this, data);
        return data;
    }
    public Object visit(ASTandOrOp node, Object data) {
        System.out.print(" " + node.value + " ");
        return data;
    }
    public Object visit(ASTandOrCond node, Object data) {
        node.childrenAccept(this, data);
        System.out.println();
        return data;
    }

    public Object visit(ASTcompOp node, Object data) {
        System.out.print(" " + node.value + " ");
        return data;
    }
    public Object visit(ASTidentifier node, Object data) {
        System.out.print(node.value);
        return data;
    }
}