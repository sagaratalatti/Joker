package com.sagar.jokesview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

/**
 * Created by sagar on 26-11-2016.
 */

public class JokesView extends AppCompatActivity {

    TextView jokesView;
    String jokes;
    String version;
    InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jokes_layout);
        jokesView = (TextView) findViewById(R.id.jokes_view);
        interstitialAd = new InterstitialAd(this);
        interstitialAd.setAdUnitId(getResources().getString(R.string.mobAd_id));
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-1481029652350108~4171001273");

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                jokes = null;
                version = "free";
            } else {
                jokes = extras.getString("jokes");
                version = extras.getString("version");
            }
        }else {
            jokes = (String) savedInstanceState.getSerializable("jokes");
            version = (String) savedInstanceState.getSerializable("version");
        }

        jokesView.setText(jokes);

        if (version.equals("free")) {
            AdView mAdView = (AdView) findViewById(R.id.mobAds_view);
            AdRequest adRequest = new AdRequest.Builder()
            .addTestDevice(getString(R.string.device_id)).build();
            mAdView.loadAd(adRequest);
        }
    }
}
