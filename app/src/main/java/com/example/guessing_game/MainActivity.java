package com.example.guessing_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button click;
    private TextView text;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        click = (Button) findViewById(R.id.button_id);
        text = (TextView) findViewById(R.id.textid);
        edit = (EditText)findViewById((R.id.edit_id));

        click.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        try {
            String guess_String  = edit.getText().toString();
            int guess_int = Integer.parseInt(guess_String);

            Random random = new Random();
            int random_number = random.nextInt( 5 )+1;
            if(random_number==guess_int)
            {
                text.setText("Congratulation won !!!");
            }
            else
            {
                text.setText("lost number "+random_number);
            }
        } catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"plz Input the number",Toast.LENGTH_SHORT).show();
        }

    }
}