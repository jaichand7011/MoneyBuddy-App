package drbtechnologies.moneybuddy.moneybuddy;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;


import static drbtechnologies.moneybuddy.moneybuddy.DashboardFragment.task4;

public class task2 extends AppCompatActivity {

    private InterstitialAd interstitialAd;
    Button a,b,c,d,e,f,g,h,i,j,k,l,m;
    Handler handler = new Handler();
    private InterstitialAd mInterstitialAd;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        adView = new AdView(this, "320109485440793_320112525440489", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) findViewById(R.id.banner_container);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();
        fbAds();

        a = (Button)findViewById(R.id.button12);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                fbAds();




                b.setEnabled(true);


            }
        });
        b = (Button)findViewById(R.id.button21);
        b.setEnabled(false);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();

                c.setEnabled(true);


            }
        });

        c = (Button)findViewById(R.id.button2);
        c.setEnabled(false);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();

                d.setEnabled(true);

            }
        });
        d = (Button)findViewById(R.id.button13);
        d.setEnabled(false);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();
                e.setEnabled(true);


            }
        });
        e = (Button)findViewById(R.id.button7);
        e.setEnabled(false);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();
                f.setEnabled(true);


            }
        });
        f = (Button)findViewById(R.id.button19);
        f.setEnabled(false);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();
                g.setEnabled(true);

            }
        });
        g = (Button)findViewById(R.id.button6);
        g.setEnabled(false);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();
                h.setEnabled(true);
            }
        });
        h = (Button)findViewById(R.id.button14);
        h.setEnabled(false);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();

                i.setEnabled(true);

            }
        });

        i = (Button)findViewById(R.id.button4);
        i.setEnabled(false);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();
                j.setEnabled(true);

            }
        });
        j = (Button)findViewById(R.id.button20);
        j.setEnabled(false);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();

                k.setEnabled(true);

            }
        });
        k = (Button)findViewById(R.id.button3);
        k.setEnabled(false);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();

                l.setEnabled(true);

            }
        });
        l = (Button)findViewById(R.id.button18);
        l.setEnabled(false);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fbAds();

                m.setEnabled(true);

            }
        });
        m = (Button)findViewById(R.id.button15);
        m.setEnabled(false);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                task4.setEnabled(true);
                task4.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                onBackPressed();
                return;

            }
        });





    }

    public void fbAds() {

        interstitialAd = new InterstitialAd(getApplicationContext(), "1186911641466087_1186912851465966");
        interstitialAd.setAdListener(new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                // Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                //Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback
                //Log.e(TAG, "Interstitial ad failed to load: " + adError.getErrorMessage());
            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                // Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                //Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                //Log.d(TAG, "Interstitial ad impression logged!");
            }
        });
        interstitialAd.loadAd();

    }
}