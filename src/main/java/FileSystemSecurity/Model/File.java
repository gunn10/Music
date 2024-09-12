package FileSystemSecurity.Model;

import FileSystemSecurity.Config.Role;

import java.util.List;

public  class File implements FileSystem {
    String filename;
    List<Role>roleList;

    public File(String filename, List<Role> roleList) {
        this.filename = filename;
        this.roleList = roleList;
        loadFromDisk();

    }
    void loadFromDisk(){
        System.out.println("Load file from disk"+filename);
    }


    @Override
    public void display() {
        System.out.println("Displayed file"+filename);
    }


}
