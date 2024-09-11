package FileSystem.Visitor;

import FileSystem.File;
import FileSystem.Folder;
import FileSystem.SymbolicLink;

public interface FileSystemVisitor {
    void visit(File file);
    void visit(Folder folder);
    void visit(SymbolicLink symbolicLink);
}
