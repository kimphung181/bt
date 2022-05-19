package com.example.bt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;package com.example.a3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText bduonglich;
    Button nhan;
    TextView bamlich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bduonglich = (EditText) findViewById(R.id.bduonglich);
        nhan= (Button) findViewById(R.id.nhan);
        bamlich= (TextView) findViewById(R.id.bamlich);
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String can[]= {"canh","Tân","Nhân","Quý","Giáp","Ất","Bình","Đinh","Mậu","Kỷ"};
                String chi[]= {"Thân","Dậu","Tuất","Hợi","Tý","Sửu","Dần","Mẹo","Thìn","Tỵ","Ngọ","Mùi"};
                String di = bduonglich.getText().toString();
                int m= Integer.parseInt(di);
                String am= can[m%10]+" "+chi[m%12];
                bamlich.setText(am);
            }
        });
    }

}

