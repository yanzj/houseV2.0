package com.mooc.house.api.common;

import com.mooc.house.api.model.User;

/**
 * 用户上下文
 */
public class UserContext {
  private static final ThreadLocal<User> USER_HOLDER = new ThreadLocal<>();
  
  public static void setUser(User user){
    USER_HOLDER.set(user);
  }
  
  public static void remove() {
    USER_HOLDER.remove();
  }
  
  public static User getUser() {
    return USER_HOLDER.get();
  }

}
