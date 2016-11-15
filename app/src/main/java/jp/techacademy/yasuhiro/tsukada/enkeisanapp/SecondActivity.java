package jp.techacademy.yasuhiro.tsukada.enkeisanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        double 円周 = intent.getDoubleExtra("円周", 0.0);
        double 面積 = intent.getDoubleExtra("面積", 0.0);
        double 表面積 = intent.getDoubleExtra("表面積", 0.0);
        double 体積 = intent.getDoubleExtra("体積", 0.0);

        TextView textView5 = (TextView) findViewById(R.id.textView5);
        TextView textView6 = (TextView) findViewById(R.id.textView6);
        TextView textView7 = (TextView) findViewById(R.id.textView7);
        TextView textView8 = (TextView) findViewById(R.id.textView8);
        textView5.setText(String.valueOf(円周));
        textView6.setText(String.valueOf(面積));
        textView7.setText(String.valueOf(表面積));
        textView8.setText(String.valueOf(体積));






    }

}
