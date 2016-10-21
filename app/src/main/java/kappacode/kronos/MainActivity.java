package kappacode.kronos;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import kappacode.kronos.fragments.*;
import kappacode.kronos.viewpageradapter.*;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        try {
            KeyguardManager mKeyGuardManager = (KeyguardManager)      this.getSystemService(Context.KEYGUARD_SERVICE);
            KeyguardManager.KeyguardLock mLock = mKeyGuardManager.newKeyguardLock(KEYGUARD_SERVICE);
            mLock.disableKeyguard();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new Goals(), "Goals");
        adapter.addFragment(new MyDay(), "My Day");
        adapter.addFragment(new History(), "History");
        viewPager.setAdapter(adapter);
    }
}
