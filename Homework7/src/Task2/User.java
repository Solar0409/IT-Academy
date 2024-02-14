package Homework7.src.Task2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class User extends Person {
    private String login;
    private String password;
    private String email;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void printUserInfo() {
        System.out.println("User info");
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) throws Exception {
        User user = new User();
//      Class<?> clazz = user.getClass();
        try {
            Field loginField = User.class.getDeclaredField("login");
//        }catch (NoSuchFieldException e){
//            throw new RuntimeException(e);
            loginField.setAccessible(true);
            loginField.set(user, "John");
            Field emailField = User.class.getDeclaredField("email");
            emailField.set(user, "john@gmail.com");

            System.out.println("login:" + loginField.get(user));
            System.out.println("Email:" + emailField.get(user));

            Method toStringMethod = User.class.getMethod("toString");
            System.out.println(toStringMethod.invoke(user));

        } catch (NoSuchFieldException | SecurityException |
                 IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | InvocationTargetException |
                 NoSuchMethodException e) {
            throw new RuntimeException(e);
        }


    }

}
    






