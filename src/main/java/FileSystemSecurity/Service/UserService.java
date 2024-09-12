package FileSystemSecurity.Service;

import FileSystemSecurity.Model.User;
import FileSystemSecurity.Repo.UserRepo;

public class UserService {
    UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    void add(User user){
        userRepo.addUser(user);
    }
    boolean find(User user){
      return  userRepo.findUser(user);

    }
}
