package com.example.sung.myanim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
    }

    public void onButton1Clicked(View v) {
        Animation transelate = AnimationUtils.loadAnimation(this, R.anim.translate);
        /*
        * 아래는 단지 하나의 위젯을 애니메이션 시키는 것이다
        * */
        //textView.startAnimation(transelate);

        /*
        * 아래는 액티비티 전체를 에니메이션 시키는 것이다
        * */
        ViewGroup container = (ViewGroup) findViewById(R.id.container);
        container.startAnimation(transelate);
    }
}
