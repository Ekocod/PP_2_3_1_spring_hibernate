package web;

import web.dao.UserDaoImp;
import web.model.User;

import java.util.List;

public class test {
    public static void main(String[] args) {
        UserDaoImp userDaoImp = new UserDaoImp();
        List<User> users = userDaoImp.getAllUsers();
        System.out.println(users);
    }
}
