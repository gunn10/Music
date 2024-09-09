package MovieTicketBooking.repository;

import MovieTicketBooking.config.Validator;
import MovieTicketBooking.model.User;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserRepository {
    private Map<String, User> registeredUsers = new ConcurrentHashMap<>();

    public UserRepository
            (){
        User user1 = new User("ashish","ashish123",1000);
        User user2 = new User("gunn","gunn123",2500);
        User user3 = new User("guna","gunnagun123",2000);

        registeredUsers.put(user1.userName(), user1);
        registeredUsers.put(user2.userName(), user2);
        registeredUsers.put(user3.userName(), user3);
    }

    public User registerUser(User user){
        if (!Validator.validateUser(user)){
            return null;
        }

        if (registeredUsers.containsKey(user.userName())){
            return null;
        }

        registeredUsers.put(user.userName(), user);
        return user;
    }

    public List<User> getAllUsers(){
        return registeredUsers.values()
                .stream().toList();
    }


}
