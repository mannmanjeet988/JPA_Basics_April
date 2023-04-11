package com.example.JPABasicsApril;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){

        return userService.addUser(user);
    }

    @GetMapping("/getUsers")
    public List<User> getAllUsers(){

        return userService.getUsers();
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    @DeleteMapping("/deleteUsers")
    public String deleteUsers(){
        return userService.deleteUsers();
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser( @RequestParam("id") int id){
        return userService.deleteUser(id);
    }

//    @PutMapping("/updateUser")
//    public String UpdateUser(@RequestParam("name") String name){
//         return userService.updateUser();
//    }
}
