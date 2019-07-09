package sg.edu.rp.c346.employeeinfoexercise2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Employees> {
    Context parent_context;
    int layout_id;
    ArrayList<Employees> employeesList;

    public CustomAdapter(Context context , int resource, ArrayList<Employees> objects){
        super(context, resource , objects);

        parent_context = context;
        layout_id = resource;
        employeesList = objects;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvParticulars = rowView.findViewById(R.id.textViewParticulars);

        // Obtain the Android Version information based on the position
        Employees currentVersion = employeesList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentVersion.getName());
        tvParticulars.setText(currentVersion.getRole() + "\n$" + currentVersion.getSalary());

        return rowView;
    }
}
