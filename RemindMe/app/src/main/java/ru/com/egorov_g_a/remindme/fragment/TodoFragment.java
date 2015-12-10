package ru.com.egorov_g_a.remindme.fragment;

import android.content.Context;
import android.os.Bundle;

import ru.com.egorov_g_a.remindme.R;

public class TodoFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static TodoFragment getInstance(Context context) {
        Bundle args = new Bundle();
        TodoFragment fragment = new TodoFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_todo));
        return fragment;
    }

    @Override
    protected int getLayout() {
        return LAYOUT;
    }
}
