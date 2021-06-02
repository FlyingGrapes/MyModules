package sg.edu.rp.c346.id20018621.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ModuleDetailActivity extends AppCompatActivity {

    //assign names
    Button goback;
    TextView tvInfo;
    TextView tvModCode;
    TextView tvModName;
    TextView tvAcadYear;
    TextView tvSemester;
    TextView tvModCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        //calling id
        tvModCode = findViewById(R.id.textViewModCode);
        tvModName = findViewById(R.id.textViewModName);
        tvAcadYear = findViewById(R.id.textViewAcademicYear);
        tvSemester = findViewById(R.id.textViewSemester);
        tvModCredit = findViewById(R.id.textViewModleCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        //info textView
        //tvInfo = findViewById(R.id.info);

        //initialising values
        //create intentDefault
        Intent intentDefault = getIntent();
        String modCode = intentDefault.getStringExtra("ModuleCode");
        String modName = intentDefault.getStringExtra("ModuleName");
        int year = intentDefault.getIntExtra("Year", 2020);
        int semester = intentDefault.getIntExtra("Semester", 1);
        int credit = intentDefault.getIntExtra("ModuleCredit",4);
        String venue = intentDefault.getStringExtra("Venue");
        //consolidated output
        // tvInfo.setText(" Module Code: " + modCode + " \n Module Name: " + modName + "\n Academic Year: " + year + "\n Semester: " + semester
        //        + "\n Module Credit: " + credit + "\n Venue: " + venue);

        //individual output
        tvModCode.setText("Module Code: " + modCode);
        tvModName.setText("Module Name: " + modName);
        tvAcadYear.setText("Academic Year: " + year);
        tvSemester.setText("Semester: " + semester);
        tvModCredit.setText("Module Credit: " + credit);
        tvVenue.setText("Venue: " + venue);



        //enhancement

        //goback button
        //assign names by calling button id<goback>
        goback = findViewById(R.id.goback);
        //when clicked
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //
                finish();
            }
        });

        if(tvModCode.equals("C328")){
            String data = "ModuleCode: C328\n" +
                    "ModuleName: Operating Systems Security\n" +
                    "Semester: 1\n" +
                    "ModuleCredit: 4\n" +
                    "Venue: W662L";
            tvVenue.setText(data);
        }



    }


}