package kappacode.kronos.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.content.Context;

//java utils
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

//Gráfico
import com.github.mikephil.charting.charts.PieChart;
import kappacode.kronos.chartmakers.DiarioPieChartMaker;

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

        listViewActivities =(ListView) inflaterView.findViewById(R.id.listView_atividades);

        Button buttonAddActivity = (Button) inflaterView.findViewById(R.id.button_adicionar_atividdade);
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
