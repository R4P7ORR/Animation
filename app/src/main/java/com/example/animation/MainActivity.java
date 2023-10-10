package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnBounce;
    private Button btnFadeIn;
    private Button btnFadeOut;
    private Button btnRotate;
    private Button btnZoomIn;
    private Button btnZoomOut;

    private TextView txtBounce;
    private TextView txtFadeIn;
    private TextView txtFadeOut;
    private TextView txtRotate;
    private TextView txtZoomIn;
    private TextView txtZoomOut;


    private Button btnFrameAnim;
    private ImageView imgMonster;

    private Animation bounceAnim;
    private Animation fadeInAnim;
    private Animation fadeOutAnim;
    private Animation rotateAnim;
    private Animation zoomInAnim;
    private Animation zoomOutAnim;

    private Boolean started;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnBounce.setOnClickListener(this);
        btnFadeIn.setOnClickListener(this);
        btnFadeOut.setOnClickListener(this);
        btnRotate.setOnClickListener(this);
        btnZoomIn.setOnClickListener(this);
        btnZoomOut.setOnClickListener(this);

        btnFrameAnim.setOnClickListener(this);

        /*btnFrameAnim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!started){
                    ((AnimationDrawable) imgMonster.getBackground()).start();
                    started = true;
                }else{
                    ((AnimationDrawable) imgMonster.getBackground()).stop();
                    started = false;
                }
            }
        });*/

    }

    public void init(){
        started = false;

        btnBounce = findViewById(R.id.btnBounce);
        btnFadeIn = findViewById(R.id.btnFadeIn);
        btnFadeOut = findViewById(R.id.btnFadeOut);
        btnRotate = findViewById(R.id.btnRotate);
        btnZoomIn = findViewById(R.id.btnZoomIn);
        btnZoomOut = findViewById(R.id.btnZoomOut);

        txtBounce = findViewById(R.id.txtBounce);
        txtFadeIn = findViewById(R.id.txtFadeIn);
        txtFadeOut = findViewById(R.id.txtFadeOut);
        txtRotate = findViewById(R.id.txtRotate);
        txtZoomIn = findViewById(R.id.txtZoomIn);
        txtZoomOut = findViewById(R.id.txtZoomOut);

        btnFrameAnim = findViewById(R.id.btnFrameAnim);
        imgMonster = findViewById(R.id.imgMonster);

        bounceAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.bounce);
        fadeInAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_in);
        fadeOutAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.fade_out);
        rotateAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
        zoomInAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_in);
        zoomOutAnim = AnimationUtils.loadAnimation(MainActivity.this, R.anim.zoom_out);

    }

    @Override
    public void onClick(View v) {
        switch (getResources().getResourceEntryName(v.getId())){
            case "btnBounce":
                txtBounce.startAnimation(bounceAnim);
                break;
            case "btnFadeIn":
                txtFadeIn.startAnimation(fadeInAnim);
                break;
            case "btnFadeOut":
                txtFadeOut.startAnimation(fadeOutAnim);
                break;
            case "btnRotate":
                txtRotate.startAnimation(rotateAnim);
                break;
            case "btnZoomIn":
                txtZoomIn.startAnimation(zoomInAnim);
                break;
            case "btnZoomOut":
                txtZoomOut.startAnimation(zoomOutAnim);
                break;
            case "btnFrameAnim":
                if (!started){
                    ((AnimationDrawable) imgMonster.getBackground()).start();
                    started = true;
                }else{
                    ((AnimationDrawable) imgMonster.getBackground()).stop();
                    started = false;
                }
                break;
        }
    }
}