package FileSystem;

import FileSystem.Visitor.FileSystemVisitor;

public class File implements FileSystem{
    @Override
    public void accept(FileSystemVisitor fileSystemVisitor) {
        fileSystemVisitor.visit(this);
    }
}
