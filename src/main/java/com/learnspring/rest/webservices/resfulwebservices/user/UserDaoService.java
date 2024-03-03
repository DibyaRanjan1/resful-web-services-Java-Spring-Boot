package com.learnspring.rest.webservices.resfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int userCount = 0;
    static {
        users.add(new User(++userCount,"Adam", LocalDate.now().minusYears(30)));
        users.add(new User(++userCount,"Hari", LocalDate.now().minusYears(25)));
        users.add(new User(++userCount,"Ram", LocalDate.now().minusYears(34)));
        users.add(new User(++userCount,"Pikun", LocalDate.now().minusYears(10)));
        users.add(new User(++userCount,"Pinku", LocalDate.now().minusYears(14)));
    }



    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        user.setId(++userCount);
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
       return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteUserById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

}
