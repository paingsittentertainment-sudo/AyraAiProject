package com.ayra.project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.content.Context;
import android.widget.*;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.BLACK);

        final EditText input = new EditText(this);
        input.setHint("ဒီမှာစာရိုက်ပါ ကိုကို...");
        input.setHintTextColor(Color.GRAY);
        input.setTextColor(Color.WHITE);
        input.setFocusableInTouchMode(true);
        input.requestFocus();

        Button btn = new Button(this);
        btn.setText("SEND");
        btn.setBackgroundColor(Color.parseColor("#BB86FC"));

        layout.addView(input);
        layout.addView(btn);
        setContentView(layout);
        
        // App ပွင့်တာနဲ့ Keyboard အလိုလို တက်လာအောင် လုပ်တဲ့နည်း
        input.postDelayed(new Runnable() {
            @Override
            public void run() {
                InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(input, InputMethodManager.SHOW_IMPLICIT);
            }
        }, 500);
    }
}
