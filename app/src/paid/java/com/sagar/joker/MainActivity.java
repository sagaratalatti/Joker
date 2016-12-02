package com.sagar.joker;
import android.annotation.TargetApi;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

import com.sagar.jokesview.JokesView;



/**
 * Created by sagar on 26-11-2016.
 */

public class MainActivity extends AppCompatActivity implements JokesTask.Callback {

    ProgressDialog progressDialog;


    @Override
    protected void onCreate(Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.layout_main);
        AppCompatButton Joke = (AppCompatButton)findViewById(R.id.joke_button);
        progressDialog = new ProgressDialog(this);
        Joke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.setMessage(getString(R.string.progress_message));
                progressDialog.setCancelable(false);
                progressDialog.show();
                showJoke();
            }
        });

    }


    public void showJoke(){
        new JokesTask(this).execute();
    }


    @Override
    public void onFinished(String result) {
        progressDialog.hide();
        Intent intent = new Intent(MainActivity.this, JokesView.class);
        intent.putExtra("jokes", result);
        intent.putExtra("version", BuildConfig.FLAVOR);
        startActivity(intent);
    }
}
