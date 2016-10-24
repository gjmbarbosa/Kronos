package kappacode.kronos.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

import com.github.mikephil.charting.charts.PieChart;


import kappacode.kronos.R;

public class MyDay extends Fragment{
    private ListView listViewActivities;
    private PieChart pieChart;

    public MyDay() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View inflaterView = inflater.inflate(R.layout.myday, container, false);

        View temp =inflaterView.findViewById(R.id.view0);

        listViewActivities =(ListView) inflaterView.findViewById(R.id.listView_activities);

        Button buttonAddActivity = (Button) inflaterView.findViewById(R.id.button_add_activity);
        buttonAddActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // do something
            }
        });

        return inflaterView;
    }

}
