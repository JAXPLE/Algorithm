package JavaStudy.DesignPattern;

import java.util.ArrayList;

public class LazyHolder {
    private static class UserDataHolder {
        private static ArrayList<User> INSTANCE = new ArrayList<>();
    }

    public static ArrayList<User> getLazyHolder1() {
        return UserDataHolder.INSTANCE;
    }


}
