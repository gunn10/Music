package FileSystem;

import FileSystem.Visitor.CompressionVisitor;
import FileSystem.Visitor.FileSystemVisitor;

public class Main {
    public static void main(String[] args) {
        FileSystem fileSystem=new File();
        FileSystemVisitor fileSystemVisitor=new CompressionVisitor();
        fileSystem.accept(fileSystemVisitor);
    }
}
