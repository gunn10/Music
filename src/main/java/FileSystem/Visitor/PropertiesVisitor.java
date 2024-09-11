package FileSystem.Visitor;

import FileSystem.File;
import FileSystem.Folder;
import FileSystem.SymbolicLink;

public class PropertiesVisitor implements FileSystemVisitor {
    public void visit(File file){
        System.out.println("Properties of file");
    }

    @Override
    public void visit(SymbolicLink symbolicLink) {
        System.out.println("Properties of Symbolic link");
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("\"Properties of folder");
    }
}
