package com.sagar.joker;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.sagar.jokesview.*;

/**
 * Created by sagar on 27-11-2016.
 */

public class MainActivity extends AppCompatActivity implements JokesTask.Callback{

    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        setContentView(R.layout.layout_main);
        progressDialog = new ProgressDialog(this);

        AppCompatButton jokeButton = (AppCompatButton)findViewById(R.id.joke_button);
        jokeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                progressDialog.setMessage(getString(R.string.progress_message));
                progressDialog.setCancelable(false);
                showJoke();
            }
        });
    }

    private void showJoke(){
        new JokesTask(this).execute();
    }

    @Override
    public void onFinished(String result) {
        progressDialog.hide();
        Intent intent  = new Intent(MainActivity.this, JokesView.class);
        intent.putExtra("jokes", result);
        intent.putExtra("version", BuildConfig.FLAVOR);
        startActivity(intent);
    }
}

