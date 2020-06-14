package com.example.bottom;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
public class Main2Activity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        bottomNavigationView = findViewById( R.id.bottom );
        viewPager = findViewById( R.id.viewpager );
        
        final Viewpageadopter viewpageadopter = new Viewpageadopter( getSupportFragmentManager() );
        viewPager.setAdapter( viewpageadopter );
        
        viewPager.addOnPageChangeListener
                ( new ViewPager.OnPageChangeListener() {
                    @Override
                    public void onPageScrolled(int i, float v, int i1) {
                    }

                    @Override
                    public void onPageSelected(int i) {
                        switch (i) {
                            case 0:
                                bottomNavigationView.setSelectedItemId( R.id.item1 );
                                break;
                            case 1:
                                bottomNavigationView.setSelectedItemId( R.id.item2 );
                                break;
                            case 2:
                                bottomNavigationView.setSelectedItemId( R.id.item3 );
                                break;
                        }
                    }

                    @Override
                    public void onPageScrollStateChanged(int i) {
                    }
                } );
        bottomNavigationView.setOnNavigationItemSelectedListener
                ( new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                        switch (menuItem.getItemId()) {
                            case R.id.item1:
                                viewPager.setCurrentItem( 0 );
                                return true;
                            case R.id.item2:
                                viewPager.setCurrentItem( 1 );
                                return true;
                            case R.id.item3:
                                viewPager.setCurrentItem( 2 );
                                return true;
                        }
                        return false;
                    }
                } );
    }
    
}