package ru.com.egorov_g_a.remindme.fragment;

import android.content.Context;
import android.os.Bundle;

import ru.com.egorov_g_a.remindme.R;

public class BirthdaysFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static BirthdaysFragment getInstance(Context context) {
        Bundle args = new Bundle();
        BirthdaysFragment fragment = new BirthdaysFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_birthdays));
        return fragment;
    }

    @Override
    protected int getLayout() {
        return LAYOUT;
    }
}
