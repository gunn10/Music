package CompilerDesign;

public abstract class Compiler {
    public final void implementation() {
        lexicalAnalysis();
        parsing();
        semanticAnalysis();
        codeGeneration();


    }
    abstract void lexicalAnalysis();
    abstract void parsing();
    abstract void semanticAnalysis();
    abstract void codeGeneration();

}
