package ru.com.egorov_g_a.remindme.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import ru.com.egorov_g_a.remindme.dto.AbstractEntityDTO;

public abstract class AbstractTabFragment<DTO extends AbstractEntityDTO> extends Fragment {

    private String title;
    protected Context context;
    protected View view;
    protected List<DTO> data;

    protected AbstractTabFragment(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(getLayout(), container, false);
        return view;
    }

    protected abstract int getLayout();

    protected abstract int titleResId();

    public abstract void refreshData(List<DTO> data);

    public void setContext(Context context) {
        this.context = context;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setData(List<DTO> data) {
        this.data = data;
    }
}
