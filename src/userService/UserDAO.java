package userService;

import java.util.HashMap;
import java.util.Map;

public class UserDAO {

    private Map<String, User> db = new HashMap<>();

    void save(User user) {
        db.put(user.getId(), user);
    }

    User find(String id) {
        return db.get(id);
    }

    void update(User user) {
        db.put(user.getId(), user);
    }

    boolean isValid(String id){
        if(!db.containsKey(id)){
            return true;
        }else{
            return false;
        }
    }

    void delete(String id) {
        db.remove(id);
    }
}
