package com.example.smartmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.smartmenu.databinding.ActivityMainBinding;
import com.ramotion.circlemenu.CircleMenuView;

public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        final CircleMenuView menuView = binding.circleMenu;
        menuView.setEventListener(new CircleMenuView.EventListener(){
            @Override
            public void onMenuOpenAnimationStart(@NonNull CircleMenuView view) {
            }

            @Override
            public void onMenuOpenAnimationEnd(@NonNull CircleMenuView view) {
            }

            @Override
            public void onMenuCloseAnimationStart(@NonNull CircleMenuView view) {
            }

            @Override
            public void onMenuCloseAnimationEnd(@NonNull CircleMenuView view) {
            }

            @Override
            public void onButtonClickAnimationStart(@NonNull CircleMenuView view, int index) {
                if (index == 0){
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,new LoginFragment()).commit();
                    menuView.setVisibility(View.GONE);
                }
            }

            @Override
            public void onButtonClickAnimationEnd(@NonNull CircleMenuView view, int index) {
            }

            @Override
            public boolean onButtonLongClick(@NonNull CircleMenuView view, int index) {
                return true;
            }

            @Override
            public void onButtonLongClickAnimationStart(@NonNull CircleMenuView view, int index) {
            }

            @Override
            public void onButtonLongClickAnimationEnd(@NonNull CircleMenuView view, int index) {
            }



        });
    }
}