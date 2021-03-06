package com.example.p0301_activutyresult;

import android.content.Intent;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AlignActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnLeft, btnCenter, btnRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_align);

        btnCenter = (Button) findViewById(R.id.btnCenter);
        btnLeft = (Button) findViewById(R.id.btnLeft);
        btnRight = (Button) findViewById(R.id.btnRight);

        btnCenter.setOnClickListener(this);
        btnLeft.setOnClickListener(this);
        btnRight.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btnLeft:
                intent.putExtra("alignment", Gravity.LEFT);
                break;
            case R.id.btnRight:
                intent.putExtra("alignment", Gravity.RIGHT);
                break;
            case R.id.btnCenter:
                intent.putExtra("alignment", Gravity.CENTER);
                break;
        }
        setResult(RESULT_OK, intent);
        finish();
    }
}