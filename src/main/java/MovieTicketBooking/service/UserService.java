package MovieTicketBooking.service;

import MovieTicketBooking.model.User;
import MovieTicketBooking.repository.UserRepository;

import java.util.HashMap;

public class UserService {
   UserRepository userRepository;

   void register(User user){
       userRepository.registerUser(user);
   }

   void getAllusers(){
       userRepository.getAllUsers();
   }
    }


