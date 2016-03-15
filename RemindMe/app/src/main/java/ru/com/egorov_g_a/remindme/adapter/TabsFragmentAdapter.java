package ru.com.egorov_g_a.remindme.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ru.com.egorov_g_a.remindme.Constants;
import ru.com.egorov_g_a.remindme.dto.AbstractEntityDTO;
import ru.com.egorov_g_a.remindme.fragment.AbstractTabFragment;
import ru.com.egorov_g_a.remindme.fragment.BirthdaysFragment;
import ru.com.egorov_g_a.remindme.fragment.HistoryFragment;
import ru.com.egorov_g_a.remindme.fragment.IdeasFragment;
import ru.com.egorov_g_a.remindme.fragment.TabFragmentFactory;
import ru.com.egorov_g_a.remindme.fragment.TodoFragment;

public class TabsFragmentAdapter<DTO extends AbstractEntityDTO> extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    private List<DTO> data;

    private HistoryFragment historyFragment;
    private IdeasFragment ideasFragment;
    private TodoFragment todoFragment;
    private BirthdaysFragment birthdaysFragment;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        this.data = new ArrayList<>();
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

        historyFragment = TabFragmentFactory.getInstance(HistoryFragment.class, context, data);

        //FIXME: в ideasFragment, todoFragment and birthdaysFragment, возможно, должны быть свои списки DTO объектов. Обратить внимание, что нужно передавать им свои data
        ideasFragment = TabFragmentFactory.getInstance(IdeasFragment.class, context, data);
        todoFragment = TabFragmentFactory.getInstance(TodoFragment.class, context, data);
        birthdaysFragment = TabFragmentFactory.getInstance(BirthdaysFragment.class, context, data);

        tabs.put(Constants.TAB_HISTORY, historyFragment);
        tabs.put(Constants.TAB_IDEAS, ideasFragment);
        tabs.put(Constants.TAB_TODO, todoFragment);
        tabs.put(Constants.TAB_BIRTHDAYS, birthdaysFragment);
    }

    public void setData(List<DTO> data) {
        this.data = data;
    }
    public void refreshHistoryTab() {
        historyFragment.refreshData(data);
    }
}
