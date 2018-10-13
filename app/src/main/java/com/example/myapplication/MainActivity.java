package com.example.myapplication;







import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2;
    TextView textView;
    EditText editText1, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);
        editText1 = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                int x = Integer.valueOf(String.valueOf(editText1.getText()));
                int y = Integer.valueOf(String.valueOf(editText2.getText()));
                textView.setText(String.valueOf(x + y));
                break;
            case R.id.button2:
                int e = Integer.valueOf(String.valueOf(editText1.getText()));
                int d = Integer.valueOf(String.valueOf(editText2.getText()));
                textView.setText(String.valueOf(e * d));
                break;
        }
        }
    }

