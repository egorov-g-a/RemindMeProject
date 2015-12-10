package ru.com.egorov_g_a.remindme.fragment;

import android.content.Context;
import android.os.Bundle;

import ru.com.egorov_g_a.remindme.R;

public class HistoryFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_example;

    public static HistoryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        HistoryFragment fragment = new HistoryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_history));
        return fragment;
    }

    @Override
    protected int getLayout() {
        return LAYOUT;
    }
}
