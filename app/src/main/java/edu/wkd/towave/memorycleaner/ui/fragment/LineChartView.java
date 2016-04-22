package edu.wkd.towave.memorycleaner.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.Bind;
import butterknife.ButterKnife;
import edu.wkd.towave.memorycleaner.R;

/**
 * Created by Administrator on 2016/4/21.
 */
public class LineChartView extends Fragment {
    View view;
    Context context;
    int count;
    long sum, available;
    float percent;
    @Nullable @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_linechartview, null);
        context = getActivity();
        ButterKnife.bind(this, view);
        return view;
    }
}