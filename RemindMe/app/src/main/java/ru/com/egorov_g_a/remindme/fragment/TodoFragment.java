package ru.com.egorov_g_a.remindme.fragment;

import java.util.List;

import ru.com.egorov_g_a.remindme.R;

public class TodoFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_todo;

    @Override
    protected int getLayout() {
        return LAYOUT;
    }

    @Override
    protected int titleResId() {
        return R.string.tab_item_todo;
    }

    @Override
    public void refreshData(List data) {
        //FIXME : STUB method
    }
}
