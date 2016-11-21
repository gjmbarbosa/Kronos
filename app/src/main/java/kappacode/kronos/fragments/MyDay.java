package kappacode.kronos.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;

//Gráfico
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.Legend.LegendPosition;

//Banco de dados
import kappacode.kronos.database.*;

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

        pieChart = (PieChart) inflaterView.findViewById(R.id.piechart);


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
