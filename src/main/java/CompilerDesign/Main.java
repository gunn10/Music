package CompilerDesign;

public class Main
{
    public static void main(String[] args) {
        Compiler Javacompiler=new Java();
        Javacompiler.implementation();

        Compiler Cppcompiler=new Cpp();
        Cppcompiler.implementation();
    }
}
