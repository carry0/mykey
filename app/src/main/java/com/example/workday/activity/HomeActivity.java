package com.example.workday.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.workday.R;
import com.example.workday.adapter.DiscoverListviewAdapter;
import com.example.workday.adapter.HomeListviewAdapter;
import com.example.workday.adapter.HomeViewPagerAdapter;
import com.example.workday.adapter.MessageListviewAdapter;

import java.util.ArrayList;

import MyFragment.DiscoverFragment;
import MyFragment.HomeFragment;
import MyFragment.MessageFragment;
import MyFragment.MyFragment;
import butterknife.BindView;
import butterknife.ButterKnife;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    TextView home, message, discover, my;
    private ListView listView;

    private FragmentManager fragmentManager;

    private HomeFragment homeFragment;
    private MessageFragment messageFragment;
    private DiscoverFragment discoverFragment;
    private MyFragment myFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        home = findViewById(R.id.framelayout_home);
        message = findViewById(R.id.framelayout_message);
        discover = findViewById(R.id.framelayout_discover);
        my = findViewById(R.id.framelayout_my);

        home.setOnClickListener(this);
        message.setOnClickListener(this);
        discover.setOnClickListener(this);
        my.setOnClickListener(this);

        fragmentManager = getSupportFragmentManager();
    }

    public void hideAll(FragmentTransaction fragmentTransaction){
        if (homeFragment!=null){ fragmentTransaction.hide(homeFragment);}
        if (messageFragment!=null){ fragmentTransaction.hide(messageFragment);}
        if (discoverFragment!=null){ fragmentTransaction.hide(discoverFragment);}
        if (myFragment!=null){ fragmentTransaction.hide(myFragment);}

    }

    @Override
    public void onClick(View v) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideAll(fragmentTransaction);
        switch (v.getId()) {
            //首页
            case R.id.framelayout_home:
                if (homeFragment == null) {
                    homeFragment = new HomeFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("index", 1);
                    homeFragment.setArguments(bundle);
                    fragmentTransaction.add(R.id.home_framelayout, homeFragment, "f1");
                }
                fragmentTransaction.show(homeFragment);
                Toast.makeText(this, "messsage", Toast.LENGTH_SHORT).show();
                break;
                //消息
            case R.id.framelayout_message:
                if (messageFragment == null) {
                    messageFragment = new MessageFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("index", 1);
                    messageFragment.setArguments(bundle);
                    fragmentTransaction.add(R.id.home_framelayout, messageFragment, "f1");
                }

                fragmentTransaction.show(messageFragment);
                Toast.makeText(this, "messsage", Toast.LENGTH_SHORT).show();

                break;
                //发现
            case R.id.framelayout_discover:
                if (discoverFragment == null) {
                    discoverFragment = new DiscoverFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("index", 1);
                    discoverFragment.setArguments(bundle);
                    fragmentTransaction.add(R.id.home_framelayout, discoverFragment, "f1");
                }
                fragmentTransaction.show(discoverFragment);
                Toast.makeText(this, "discover", Toast.LENGTH_SHORT).show();

                break;
                //我
            case R.id.framelayout_my:
//                if (myFragment == null) {
//                    myFragment = new MyFragment();
//                    Bundle bundle = new Bundle();
//                    bundle.putInt("index", 1);
//                    myFragment.setArguments(bundle);
//                    fragmentTransaction.add(R.id.home_framelayout, myFragment, "f1");
//                }
//                fragmentTransaction.show(myFragment);
                Toast.makeText(this, "my", Toast.LENGTH_SHORT).show();
                break;

        }
        fragmentTransaction.commitAllowingStateLoss();
    }
}
