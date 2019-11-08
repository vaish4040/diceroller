package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int random(){

        Random r = new Random();
        int rand = r.nextInt(7 - 1) + 1;
        return rand;
    }

    public void on_button_click (View view){
        TextView tv = (TextView) findViewById(R.id.editText);
        tv.setText("");
        int random = random();
        TextView display = (TextView) findViewById(R.id.editText);
        display.setText(Integer.toString(random));

        EditText input = (EditText) findViewById(R.id.editText);

        int userinput1 = Integer.parseInt(input.getText().toString());

        if(userinput1 == random){
            tv.setText("Congratulations you guessed correctly");
        }
    }

    public void button_click (View view){

        int random = random();
        TextView question = (TextView) findViewById(R.id.editText2);
        if (random == 1){
            question.setText("If you could go anywhere in the world, where would you go?");
        }

        else if (random == 2){
            question.setText("If you were stranded on a desert island, what three things would you want to take with you?");
        }

        else if (random == 3){
            question.setText("If you could eat only one food for the rest of your life, what would that be?");
        }

        else if (random == 4){
            question.setText("If you won a million dollars, what is the first thing you would buy?");
        }

        else if (random == 5){
            question.setText("If you could spaned the day with one fictional character, who would it be?");
        }
        else {
            question.setText("If you found a magic lantern and a genie gave you three wishes, what would you wish?");
        }
    }

    public void click (View view){

        Intent intent = new Intent (this, breaker.class);
        startActivity(intent);
    }
}