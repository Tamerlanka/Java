package maraphone.day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;       // список пользователей, на которых подписан пользователь.

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }
    public void subscribe(User user){                   //подписывает this.пользователя на usera
        this.subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {            //проверяет подписку this.пользователя на usera
        for (User perec : subscriptions) {
            if (perec.getUsername().equals(user.getUsername()))
                return true;
        }
        return false;
    }

//        public boolean isSubscribed(User user) {                                  //вариант решения предложенный преподавателем
//        return this.subscriptions.contains(user);
//    }

    public boolean isFriend(User user){                                             //Друзья если взаимная подписка
        return this.isSubscribed(user)&&user.isSubscribed(this);
    }

    public void sendMessage(User user, String text){
        MessageDatabase.sendMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<User> subscriptions) {
        this.subscriptions = subscriptions;
    }
}
