package FileSystem;

import FileSystem.Visitor.FileSystemVisitor;

public class Folder implements FileSystem{
    @Override
    public void accept(FileSystemVisitor fileSystemVisitor) {
        fileSystemVisitor.visit(this);
    }
}
