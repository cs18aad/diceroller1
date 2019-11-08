package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int correct_counter = 1;

    public static int Roll_the_dice() {
        Random r = new Random();
        int number = r.nextInt(6);
        return number;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void on_click_button1(View view) {
        int number = Roll_the_dice();

        TextView tv = this.findViewById(R.id.numberTextView);
        TextView et = this.findViewById(R.id.editText);
        TextView tv2 = this.findViewById(R.id.textView);

        tv.setText(Integer.toString(number));
        String value = et.getText().toString();
        int Fvalue = Integer.parseInt(value);


        if (number == Fvalue) {

            tv.setText(String.valueOf(number) + " " + "Congratulations!");
            tv2.setText(String.valueOf(correct_counter));
            correct_counter++;
        }
    }

        public void on_button_click_IceBr(View view) {
            int Roll = Roll_the_dice();

            TextView tv = this.findViewById(R.id.textView);
            List<String> QLIST = new ArrayList<>();
            QLIST.add("If you could go anywhere in the world, where would you go?");//1
            QLIST.add("If you were stranded on a desert island, what three things would you want to take with you?"); //2
            QLIST.add("If you could eat only one food for the rest of your life, what would that be?"); //3
            QLIST.add("If you won a million dollars, what is the first thing you would buy?");//4
            QLIST.add("If you could spaned the day with one fictional character, who would it be?");//5
            QLIST.add("If you found a magic lantern and a genie gave you three wishes, what would you wish?");//6

            if (Roll == 1)
                tv.setText(QLIST.get(0));
            if (Roll == 2)
                tv.setText(QLIST.get(1));
            if (Roll == 3)
                tv.setText(QLIST.get(2));
            if (Roll == 4)
                tv.setText(QLIST.get(3));
            if (Roll == 5)
                tv.setText(QLIST.get(4));
            if (Roll == 6)
                tv.setText(QLIST.get(5));

        }



}
