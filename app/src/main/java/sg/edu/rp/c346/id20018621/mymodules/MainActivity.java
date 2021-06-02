package sg.edu.rp.c346.id20018621.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //assign names
    TextView tvC346;
    TextView tvC203;
    TextView tvC328;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //call the textView id<tvC346>
        tvC346 = findViewById(R.id.tvC346);
        //upon clicking will show following
        tvC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create an intent that refers to ModuleDetailActivity.class
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                //assign values
                intent.putExtra("ModuleCode", "C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "E62E");
                startActivity(intent);
            }
        });

        tvC203 = findViewById(R.id.tvC203);
        tvC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                //assign values
                intent.putExtra("ModuleCode", "C203");
                intent.putExtra("ModuleName", "C203 Web Development in php");
                intent.putExtra("AcademicYear", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "W67M");
                startActivity(intent);
            }
        });


        tvC328 = findViewById(R.id.tvC328);
        tvC328.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                //assign values
                intent.putExtra("ModuleCode", "C328");
                intent.putExtra("ModuleName", "C328 Operating Systems Security");
                intent.putExtra("AcademicYear", "2021");
                intent.putExtra("Semester", "1");
                intent.putExtra("ModuleCredit", "4");
                intent.putExtra("Venue", "E62D");
                startActivity(intent);
            }
        });
    }

}