package FileSystem;

import FileSystem.Visitor.FileSystemVisitor;

public interface FileSystem {
    void accept(FileSystemVisitor fileSystemVisitor);
}
