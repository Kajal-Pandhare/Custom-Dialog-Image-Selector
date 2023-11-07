package com.example.customdialog1;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class SelectDialog extends Dialog {
    private ImageView image1;
    private ImageView image2;

    private ImageView image3;
    private ImageView image4;
    private ImageView image5;
    private ImageView image6;
    private Button selectbtn;
    private Context context;
    boolean img1,img2,img3,img4,img5,img6;

    public interface OnLoginListener{
        void forImageSelect(int image,SelectDialog selectDialog);
    }

    private OnLoginListener onLoginListener = null;


    public void setOnLoginListener(OnLoginListener onLoginListener){
        this.onLoginListener = onLoginListener;
    }
    public SelectDialog(Context context){
        super(context);
        this.context=context;

        initViews();


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               img1=true;
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img2=true;
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img3=true;
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img4=true;
            }
        });
        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img5=true;
            }
        });
        image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img6=true;
            }
        });
        selectbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (img1==true) {
                            onLoginListener.forImageSelect(R.drawable.cat1,SelectDialog.this);
                            //mt("First cat");
                    }
                if (img2==true) {
                    onLoginListener.forImageSelect(R.drawable.cat2,SelectDialog.this);
                    //mt("Second cat");
                }
                if (img3==true) {
                    onLoginListener.forImageSelect(R.drawable.cat3,SelectDialog.this);
                    //mt("Third cat");
                }
                if (img4==true) {
                    onLoginListener.forImageSelect(R.drawable.cat4,SelectDialog.this);
                    //mt("Fourth cat");
                }
                if (img5==true) {
                    onLoginListener.forImageSelect(R.drawable.cat5,SelectDialog.this);
                    //mt("Fifth cat");
                }
                if (img6==true) {
                    onLoginListener.forImageSelect(R.drawable.cat6,SelectDialog.this);
                }
            }
        });
    }
    private void mt(String text){
        Toast.makeText(context,text,Toast.LENGTH_LONG).show();
    }
    private void initViews(){
        setContentView(R.layout.main_activity);
        image1 = findViewById(R.id.img1);
        image2 = findViewById(R.id.img2);
        image3 = findViewById(R.id.img3);
        image4 = findViewById(R.id.img4);
        image5 = findViewById(R.id.img5);
        image6 = findViewById(R.id.img6);
        selectbtn = findViewById(R.id.btnSelect);
    }
}
