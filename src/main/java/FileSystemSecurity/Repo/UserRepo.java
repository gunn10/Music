package FileSystemSecurity.Repo;

import FileSystemSecurity.Config.Role;
import FileSystemSecurity.Model.User;

import java.util.HashMap;

public class UserRepo {
    HashMap<String, User>userHashMap=new HashMap<>();
    public UserRepo(){
    User user1=new User("Gunn", Role.ADMIN);
    User user2=new User("Garima",Role.ADMIN);
    User user3=new User("Ansh",Role.GUEST);


        userHashMap.put(user1.getName(),user1);
        userHashMap.put(user2.getName(),user2);
        userHashMap.put(user3.getName(),user3);

    }
    public void addUser(User user){
      userHashMap.put(user.getName(), user);
    }
   public boolean findUser(User user){
       if(userHashMap.containsKey(user.getName())){
           return true;
       }else{
           return false;
       }
   }

}
