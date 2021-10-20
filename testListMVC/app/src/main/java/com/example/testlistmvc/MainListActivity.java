package com.example.testlistmvc;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.testlistmvc.Modelos.InterestPoint;

import java.util.List;

public class MainListActivity extends Activity {

    ListView listView;
    ArrayAdapter<InterestPoint> todoItemsAdapter;
    TravelPointsApplication tpa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.list);
        tpa = (TravelPointsApplication)getApplicationContext();
        initializeList(tpa.pointList);
        todoItemsAdapter = new ArrayAdapter<InterestPoint>(this, R.layout.row_layout, R.id.listText, tpa.pointList);

        listView.setAdapter(todoItemsAdapter);
    }

    public void initializeList(List<InterestPoint> aPointList) {

        InterestPoint aInterestPoint;
        Double latitud = 43.34343;
        Double longitud = 2.34343;

        for(int i=0; i<5; i++){
            aInterestPoint = new InterestPoint();
            aInterestPoint.setNombre("mismo nombre");
            aInterestPoint.setLatitud(latitud+i);
            aInterestPoint.setLongitud(longitud+i);
            aPointList.add(i,aInterestPoint);

        }
    }

}
