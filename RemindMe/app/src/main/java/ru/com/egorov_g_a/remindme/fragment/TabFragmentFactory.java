package ru.com.egorov_g_a.remindme.fragment;

import android.content.Context;
import android.os.Bundle;

import java.util.List;

import ru.com.egorov_g_a.remindme.dto.AbstractEntityDTO;

public class TabFragmentFactory {

    public static <T extends AbstractTabFragment, DTO extends AbstractEntityDTO> T getInstance(Class<T> tClass, Context context, List<DTO> data) {
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
        instance.setData(data);
        return instance;
    }
}
