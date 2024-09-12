package FileSystemSecurity.Proxy;

import FileSystemSecurity.Config.Role;
import FileSystemSecurity.Model.File;
import FileSystemSecurity.Model.FileSystem;
import FileSystemSecurity.Model.User;
import FileSystemSecurity.Service.UserService;

import java.util.List;

public class ProxyFile implements FileSystem {
    private File file;
    private String filename;
    private List<Role> roleList;
    private User user;
    private UserService userService;

    public ProxyFile(String filename, List<Role> roleList, User user, UserService userService) {
        this.filename = filename;
        this.roleList = roleList;
        this.user = user;
        this.userService = userService;
    }

    @Override
    public void display() {

        if (userService.find(user)) {

            if (roleList.contains(user.getRole())) {
                if (file == null) {
                    file = new File(filename, roleList);
                }
                file.display();
            } else {
                System.out.println("You are not authorized to access this file.");
            }
        } else {
            System.out.println("User not authenticated.");
        }
    }
}
