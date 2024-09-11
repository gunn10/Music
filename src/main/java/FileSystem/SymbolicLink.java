package FileSystem;

import FileSystem.Visitor.FileSystemVisitor;

public class SymbolicLink implements FileSystem{
    @Override
    public void accept(FileSystemVisitor fileSystemVisitor) {
        fileSystemVisitor.visit(this);
    }
}
