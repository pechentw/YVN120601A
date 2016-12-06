package com.soho.yvtc.yvn120601a;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickA(View v)
    {
        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.linearLayout1, new FragmentA(),"f_a");
        ft.commit();
    }

    public void clickB(View v)
    {
        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.linearLayout1, new FragmentB(),"f_b");
        ft.commit();
    }
}
