package com.example.anotheractivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.buttonTest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=
                        new Intent(MainActivity.this,MainActivity2.class);


                EditText edit1 = (EditText)findViewById(R.id.forname);
                EditText edit2 = (EditText)findViewById(R.id.forsex);
                String namee = edit1.getText().toString();
                String sexx = edit2.getText().toString();
                String TAG = "LIFE";
                Log.i(TAG,namee + sexx);
                intent.putExtra("name",namee);
                intent.putExtra("sex",sexx);

                startActivityForResult(intent,0);
                //0是请求码
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0 && resultCode == 0){
            String str = data.getStringExtra("result");
            Toast.makeText(this,str,Toast.LENGTH_LONG).show();
        }
    }


    public void onClick(View view) {
    }
}