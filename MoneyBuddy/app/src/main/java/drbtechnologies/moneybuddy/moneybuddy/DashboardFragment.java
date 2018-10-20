package drbtechnologies.moneybuddy.moneybuddy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;

/**
 * Created by deekshith raj basa on 10/18/2018.
 */

public class DashboardFragment extends Fragment implements View.OnClickListener {
    private View myview;
  public static Button task1 , task2, task3, task4;
   public  static Handler handler;
    private AdView adView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
     myview = inflater.inflate(R.layout.fragment_dashboard, null);



        adView = new AdView(getContext(), "320109485440793_320112525440489", AdSize.BANNER_HEIGHT_50);

        // Find the Ad Container
        LinearLayout adContainer = (LinearLayout) myview.findViewById(R.id.banner_container1);

        // Add the ad view to your activity layout
        adContainer.addView(adView);

        // Request an ad
        adView.loadAd();


        //just change the
        task1 = (Button) myview.findViewById(R.id.task1);
        task1.setOnClickListener((View.OnClickListener) this);
        task2 = (Button) myview.findViewById(R.id.task2);
        task2.setEnabled(false);

        task2.setOnClickListener((View.OnClickListener) this);

        task4 = (Button) myview.findViewById(R.id.taskf);
        task4.setEnabled(false);
        task4.setOnClickListener((View.OnClickListener) this);


        //with the fragment you want to inflate
        //like if the class is HomeFragment it should have R.layout.home_fragment
        //if it is DashboardFragment it should have R.layout.fragment_dashboard
        return myview;






    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.task1:
                startActivity(new Intent(getContext(), task1.class));
                task1.setBackgroundColor(getResources().getColor(R.color.red));
                new Handler().postDelayed(new Runnable() {

                    @Override
                    public void run() {

                        DashboardFragment.task1.setEnabled(false);
                    }
                }, 5000);
                break;

            case R.id.task2:
                startActivity(new Intent(getContext(), task2.class));
                task2.setBackgroundColor(getResources().getColor(R.color.red));

            case R.id.taskf:



            default:
                break;
        }

    }




}
