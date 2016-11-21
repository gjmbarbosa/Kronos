package kappacode.kronos.chartmakers;

import com.github.mikephil.charting.charts.Chart;

import java.util.List;

public interface ChartMaker<T> {
    void getChart(Chart chart, List<T> dados, int pieChartWidth, int pieChartHeight);
}