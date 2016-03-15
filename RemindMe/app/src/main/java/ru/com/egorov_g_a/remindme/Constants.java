package ru.com.egorov_g_a.remindme;

public class Constants {
    public static final int TAB_HISTORY = 0;
    public static final int TAB_IDEAS = 1;
    public static final int TAB_TODO = 2;
    public static final int TAB_BIRTHDAYS = 3;

    public static class URL {
        private static final String HOST ="http://192.168.56.1:8080/";

        public static final String GET_REMIND_ITEM = HOST + "reminder/get";
    }
}
