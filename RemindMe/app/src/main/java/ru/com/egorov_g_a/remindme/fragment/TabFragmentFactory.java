package ru.com.egorov_g_a.remindme.fragment;

import android.content.Context;
import android.os.Bundle;

public class TabFragmentFactory {

    public static <T extends AbstractTabFragment> T getInstance(Class<T> tClass, Context context) {
        T instance = null;
        try {
            instance = tClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Bundle args = new Bundle();
        instance.setArguments(args);
        instance.setContext(context);
        instance.setTitle(context.getString(instance.titleResId()));
        return instance;
    }
}
