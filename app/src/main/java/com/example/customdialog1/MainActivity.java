package com.example.customdialog1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button buttonSelect;
    private ImageView imgview;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initviews();

        buttonSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           SelectDialog loginDialog = new SelectDialog(MainActivity.this);
           loginDialog.setOnLoginListener(new MyOnLoginListener());
           loginDialog.show();
            }
        });
    }
    private void initviews(){
        setContentView(R.layout.login_dialog);

        imgview = findViewById(R.id.imageview);
        buttonSelect = findViewById(R.id.btnSelect);
    }
    private class MyOnLoginListener implements SelectDialog.OnLoginListener{
        @Override
        public void forImageSelect(int image, SelectDialog selectDialog) {
            selectDialog.dismiss();

            imgview.setImageResource(image);

        }
    }
}
