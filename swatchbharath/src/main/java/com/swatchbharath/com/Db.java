package com.swatchbharath.com;

import java.util.ArrayList;

public class Db {

    private ArrayList<User> users;
    private static Db dbInstance;

    private Db() {
        users = new ArrayList<>();
    }

    public synchronized Db getInstance() {
        synchronized (Db.class) {
            if (dbInstance == null) {
                dbInstance = new Db();
            }
            return dbInstance;
        }
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public boolean isUserExist(String email) {
        for (User user : this.users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public User getUser(String email) {
        for (User user : this.users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public boolean isUserNameExist(String name) {
        for (User user : this.users) {
            if (user.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}