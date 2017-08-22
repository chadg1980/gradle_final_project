package com.h.chad.chadjokeandroidlibrary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

public class displayJokeActivity extends AppCompatActivity {

    public final static String GET_THE_JOKE = "GET_THE_JOKE";
    public final static String TAG = displayJokeActivity.class.getName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        Intent getJoke = getIntent();
        String theJoke = getJoke.getStringExtra(GET_THE_JOKE);
        Log.e(TAG, "The joke: " + theJoke);
        setTheJokeText(this, theJoke);
    }

    private void setTheJokeText(Context context, String theJoke) {
        TextView tv_joke = (TextView) findViewById(R.id.tv_theJoke);
        if(!TextUtils.isEmpty(theJoke)){
            tv_joke.setText(theJoke);
        }
    }
}
