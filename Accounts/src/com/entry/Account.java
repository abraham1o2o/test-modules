package com.entry;

import com.user.User;
import java.util.ArrayList;
import java.util.List;

public class Account {
  private static final List<User> users = new ArrayList<>();
  private static int idGenerator = 5000;

  public void registerUser(String email, String password) {
      int id = ++idGenerator;
      User newUser = new User(email,password,id);
      users.add(newUser);
  }

  public void displayUsers() { for (User user : users ) System.out.println(user); }
}
