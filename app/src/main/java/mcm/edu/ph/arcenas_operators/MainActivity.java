package mcm.edu.ph.arcenas_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);

        int birthYear = 2002;
        int birthMonth = 10;
        int birthday = 23;

        int currentYear = 2021;
        int currentMonth = 3;
        int currentDay = 27;

        int ageInYears, ageInMonths, ageIndays;

        if(birthMonth > currentMonth){
            currentMonth += 12;
            currentYear -= 1;
        }

        if(birthday > currentDay){
            currentDay += 30;
            currentMonth -= 1;
        }

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageIndays = currentDay - birthday;


            display.setText("My precise age is"+
                    String.valueOf(ageInYears)+
                    " Years,\n "+
                    String.valueOf(ageInMonths)+
                    " Months,\n "+
                    String.valueOf(ageIndays)+
                    " Days ");



    }
}