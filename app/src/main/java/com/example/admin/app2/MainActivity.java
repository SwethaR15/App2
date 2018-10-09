package com.example.admin.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;

public class MainActivity extends AppCompatActivity {
    ExpandableListView expandableListView;
    String[] group={"MainCourse","Starters","Cakes"};
    String[][] prod_name={{"Biriyani","Pulav","EggFriedRice","VegFriedRice"},{"EggRoll","VegRoll","Manchurian","CornMarchuria"},
            {"ChocolateCake","WalnutCake","AlmondCake","RedVelvetCake"}};
    int[][] images={{R.drawable.biri,R.drawable.pulav,R.drawable.fried,R.drawable.eggfried},{R.drawable.eggroll,R.drawable.wrap,R.drawable.roll,R.drawable.cornn}
            ,{R.drawable.choco,R.drawable.pista,R.drawable.badam,R.drawable.red}};
    String[][] prod_price={{"Rs.180","Rs.150","Rs.120","Rs.90"},{"Rs.110","Rs.90","Rs.140","Rs.160"},
            {"Rs.120","Rs.110","Rs.120","Rs.110"}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        expandableListView=findViewById(R.id.expandable);
        Adapter adapter=new Adapter(this,group,prod_name,prod_price,images);
        expandableListView.setAdapter(adapter);
    }
}
