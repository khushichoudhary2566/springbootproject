package com.being_infinity.springboot_beginner_cohort_3.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.being_infinity.springboot_beginner_cohort_3.models.User;

@Service
public class UserService {
    private final List<User> allUsers;

    int nextId=3;

    public UserService() {
        allUsers=new ArrayList<>();
        allUsers.add(new User(1, "Mary Doe", "Female", "/images/cartoon.png"));
        allUsers.add(new User(2, "John Doe", "Male", "/images/male.jpg"));
    }

    public List<User> getAllUsers(){
        return allUsers;
    }
    public User getUserById(int id){
        for(int i=0;i<allUsers.size();i++){
            if(allUsers.get(i).getID()==id)
                return allUsers.get(i);
        }
        return null;
    }

    public User addUser(User user){
        user.setID(nextId);
        nextId++;
        allUsers.add(user);
        return user;
    }

    public User updateUser(int id, User user){
        for(int i=0;i<allUsers.size();i++){
            User temp=allUsers.get(i);
            if(temp.getID()==id){
                temp.setName(user.getName());
                temp.setGender(user.getGender());
                temp.setImage(user.getImage());
                return temp;
            }
        }
        return null;
    }

    public boolean deleteUser(int id){
        for(int i=0;i<allUsers.size();i++){
            if(allUsers.get(i).getID()==id){
                allUsers.remove(i);
                return true;
            }
        }
        return false;
    }
    public User myRandomUser(){
        if(allUsers.isEmpty())
            return null;
        Random rand=new Random();
        int randomId=rand.nextInt(allUsers.size());
        return allUsers.get(randomId);
    }
}
