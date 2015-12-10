package ru.com.egorov_g_a.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.HashMap;
import java.util.Map;

import ru.com.egorov_g_a.remindme.Constants;
import ru.com.egorov_g_a.remindme.fragment.AbstractTabFragment;
import ru.com.egorov_g_a.remindme.fragment.BirthdaysFragment;
import ru.com.egorov_g_a.remindme.fragment.TabFragmentFactory;
import ru.com.egorov_g_a.remindme.fragment.HistoryFragment;
import ru.com.egorov_g_a.remindme.fragment.IdeasFragment;
import ru.com.egorov_g_a.remindme.fragment.TodoFragment;

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(Constants.TAB_HISTORY, TabFragmentFactory.getInstance(HistoryFragment.class, context));
        tabs.put(Constants.TAB_IDEAS, TabFragmentFactory.getInstance(IdeasFragment.class, context));
        tabs.put(Constants.TAB_TODO, TabFragmentFactory.getInstance(TodoFragment.class, context));
        tabs.put(Constants.TAB_BIRTHDAYS, TabFragmentFactory.getInstance(BirthdaysFragment.class, context));
    }
}
