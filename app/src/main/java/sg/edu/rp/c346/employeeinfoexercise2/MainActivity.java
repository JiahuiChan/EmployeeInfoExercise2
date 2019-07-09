package sg.edu.rp.c346.employeeinfoexercise2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Employees> employeesList;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listViewEmployee);

        employeesList = new ArrayList<Employees>();

        employeesList.add(new Employees("John", "Software Technical Leader",3400.0));
        employeesList.add(new Employees("May", "Programmer",2200.0));

        ca = new CustomAdapter(this, R.layout.column , employeesList);

        lv.setAdapter(ca);

    }
}
