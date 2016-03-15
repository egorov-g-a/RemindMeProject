package ru.com.egorov_g_a.remindme.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ru.com.egorov_g_a.remindme.R;
import ru.com.egorov_g_a.remindme.adapter.RemindListAdapter;

public class HistoryFragment extends AbstractTabFragment {
    private static final int LAYOUT = R.layout.fragment_history;
    private RemindListAdapter adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        adapter = new RemindListAdapter(data);
        recyclerView.setAdapter(adapter);
        return view;
    }

    @Override
    protected int getLayout() {
        return LAYOUT;
    }

    @Override
    protected int titleResId() {
        return R.string.tab_item_history;
    }

    @Override
    public void refreshData(List data) {
        adapter.setData(data);
        adapter.notifyDataSetChanged();
    }


}
