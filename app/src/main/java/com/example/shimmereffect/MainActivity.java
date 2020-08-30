package com.example.shimmereffect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.facebook.shimmer.ShimmerFrameLayout;

public class MainActivity extends AppCompatActivity {
    ShimmerFrameLayout shimmer1;
    ImageView imageload;
    View view1;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handler= new Handler();

        imageload=(ImageView)findViewById(R.id.imageload);
        view1=(View)findViewById(R.id.view1);

        shimmer1= (ShimmerFrameLayout) findViewById(R.id.shimmer_view_container1);
        shimmer1.startShimmer(); //start Shimmer animation of shimmer

        Log.d("text","wait for 3 secs to load image");
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Log.d("text2","working");
                shimmer1.stopShimmer();
                view1.setVisibility(View.GONE);
                imageload.setVisibility(View.VISIBLE);
            }
        },3000);
    }
}