package com.maayan.integrative_coursesearch;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class ShowGraph extends AppCompatActivity {

    private com.github.mikephil.charting.charts.BarChart barChart;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_graph_page);

        barChart = findViewById(R.id.chart);
        ArrayList<BarEntry> entries = new ArrayList<>();
        entries.add(new BarEntry(0, 36));
        entries.add(new BarEntry(1, 6));
        entries.add(new BarEntry(2, 4));
        entries.add(new BarEntry(3, 7));
        entries.add(new BarEntry(4, 7));
        entries.add(new BarEntry(5, 6));
        entries.add(new BarEntry(6, 13));
        entries.add(new BarEntry(7, 14));
        entries.add(new BarEntry(8, 7));

        final List<String> list_x_axis_name = new ArrayList<>();
        list_x_axis_name.add("0-59.9");
        list_x_axis_name.add("60-64");
        list_x_axis_name.add("65-69");
        list_x_axis_name.add("70-74");
        list_x_axis_name.add("75-79");
        list_x_axis_name.add("80-84");
        list_x_axis_name.add("85-89");
        list_x_axis_name.add("90-94");
        list_x_axis_name.add("95-100");

        BarDataSet barDataSet = new BarDataSet(entries, "Bar Data Set");
        barDataSet.setColors(ColorTemplate.LIBERTY_COLORS);
        barDataSet.setValueTextColor(Color.BLACK);
        barDataSet.setValueTextSize(16f);

        BarData barData = new BarData(barDataSet);
        barData.setValueFormatter(new ValueFormatter() {
            @Override
            public String getFormattedValue(float value) {
                return (int)value + "%";
            }
        });
        barChart.setData(barData);


        XAxis xAxis = barChart.getXAxis();
        xAxis.setGranularity(1f);
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);

        xAxis.setValueFormatter(new ValueFormatter() {
            @Override
            public String getAxisLabel(float value, AxisBase axis) {
                int index = (int) value;
                return list_x_axis_name.get(index);

            }
        });

        YAxis leftAxis = barChart.getAxisLeft();
        leftAxis.setGranularity(1f);
        leftAxis.setAxisMinimum(0f);
        leftAxis.setDrawGridLines(false);

        YAxis rightAxis = barChart.getAxisRight();
        rightAxis.setEnabled(false);

        barChart.getDescription().setEnabled(false);
        barChart.setDrawGridBackground(false);
        barChart.animateY(2000);

        barChart.invalidate();
    }

}
