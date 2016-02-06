package ru.com.egorov_g_a.remindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ru.com.egorov_g_a.remindme.R;
import ru.com.egorov_g_a.remindme.adapter.RemindListAdapter;
import ru.com.egorov_g_a.remindme.dto.RemindDTO;

public class HistoryFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new RemindListAdapter(createMockRemindListData()));
        return view;
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Item 1"));
        data.add(new RemindDTO("Item 2"));
        data.add(new RemindDTO("Item 3"));
        data.add(new RemindDTO("Item 4"));
        data.add(new RemindDTO("Item 5"));
        data.add(new RemindDTO("Item 6"));

        return data;
    }

    @Override
    protected int getLayout() {
        return LAYOUT;
    }

    @Override
    protected int titleResId() {
        return R.string.tab_item_history;
    }
}
