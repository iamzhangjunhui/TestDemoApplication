package com.example.testdemoapplication;

import android.graphics.Path;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        TextView tv=findViewById(R.id.tv);
//        Animation animation=AnimationUtils.loadAnimation(this,R.anim.scale_anim);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//            Path path=new Path();
//            path.moveTo(0,0);
//            path.quadTo(0.25f,0.25f,1,1);
//            PathInterpolator interpolator = new PathInterpolator(path);
//            animation.setInterpolator(interpolator);
//
//        }
//        tv.startAnimation(animation);

    }
}
