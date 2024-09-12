package FileSystemSecurity;

import FileSystemSecurity.Config.Role;
import FileSystemSecurity.Model.FileSystem;
import FileSystemSecurity.Model.User;
import FileSystemSecurity.Proxy.ProxyFile;
import FileSystemSecurity.Repo.UserRepo;
import FileSystemSecurity.Service.UserService;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserRepo userRepo = new UserRepo();
        UserService userService = new UserService(userRepo);

        User user1 = new User("Gunn", Role.ADMIN);
        User user2 = new User("Ansh", Role.GUEST);
        User user3=new User("Ashish",Role.ADMIN);

        userService.add(user1);
        userService.add(user2);

        List<Role> fileRoles = Arrays.asList(Role.ADMIN);

        FileSystem proxyFile1 = new ProxyFile("testFile.txt", fileRoles, user1, userService);

        proxyFile1.display();

        FileSystem proxyFile2 = new ProxyFile("testFile.txt", fileRoles, user2, userService);

        proxyFile2.display();

        FileSystem proxyFile3=new ProxyFile("example.txt",fileRoles,user3,userService);

        proxyFile3.display();
    }
}
