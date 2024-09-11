package FileSystem.Visitor;

import FileSystem.File;
import FileSystem.Folder;
import FileSystem.SymbolicLink;

public class CompressionVisitor implements FileSystemVisitor {
    @Override
    public void visit(File file) {
        System.out.println("Compression of file");
    }

    @Override
    public void visit(Folder folder) {
        System.out.println("Compression of file");

    }

    @Override
    public void visit(SymbolicLink symbolicLink) {
        System.out.println("Compression of file");

    }
}
