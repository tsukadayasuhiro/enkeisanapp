package jp.techacademy.yasuhiro.tsukada.enkeisanapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        EditText editText1 = (EditText) findViewById(R.id.editText1);
        editText1.setInputType
                ( InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);

        String string1 = editText1.getText().toString();


        if (string1.equals("")) {
            return;
        }
        double stringToValue1 = Double.parseDouble(string1);
        double 円周 = 0.0;
        double 面積 = 0.0;
        double 表面積 = 0.0;
        double 体積 = 0.0;

        BigDecimal a = new BigDecimal(3.14 * 2);
        BigDecimal b = new BigDecimal(string1);

        if (v.getId() == R.id.button1) {
            円周 =  a.multiply(b).doubleValue();
            面積 =  stringToValue1 *  stringToValue1 * 3.14;
            表面積 = stringToValue1 * stringToValue1 * 4.0 * 3.14 ;
            体積 = stringToValue1 *  stringToValue1 *  stringToValue1 * 4.0 * 3.14;
        }
        BigDecimal bigDecimal1 = new BigDecimal(String.valueOf(円周));
        BigDecimal bigDecimal2 = new BigDecimal(String.valueOf(面積));
        BigDecimal bigDecimal3 = new BigDecimal(String.valueOf(表面積));
        BigDecimal bigDecimal4 = new BigDecimal(String.valueOf(体積));

        円周 = bigDecimal1.setScale(14, RoundingMode.DOWN).doubleValue();
        面積 = bigDecimal2.setScale(14, RoundingMode.DOWN).doubleValue();
       表面積 = bigDecimal3.setScale(14, RoundingMode.DOWN).doubleValue();
       体積 = bigDecimal4.setScale(14, RoundingMode.DOWN).doubleValue();

        System.out.println(円周);
        System.out.println(面積);
        System.out.println(表面積);
        System.out.println(体積);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("円周" , 円周 );
        intent.putExtra("面積", 面積 );
        intent.putExtra("表面積", 表面積 );
        intent.putExtra("体積", 体積 );

        startActivity(intent);






















    }


}

