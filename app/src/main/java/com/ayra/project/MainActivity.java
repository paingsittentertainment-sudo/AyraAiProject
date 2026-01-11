package com.ayra.project;

import android.app.Activity;
import android.os.Bundle;
import android.widget.*;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.RED); // အနီရောင် (ဒါမှ အသစ်မှန်းသိမှာ)
        layout.setPadding(50, 50, 50, 50);

        TextView text = new TextView(this);
        text.setText("Keyboard အဆင်ပြေပါစေ ကိုကို!");
        text.setTextColor(Color.WHITE);
        layout.addView(text);

        EditText input = new EditText(this);
        input.setHint("ဒီမှာ စာရိုက်ပါ...");
        input.setBackgroundColor(Color.WHITE);
        input.setTextColor(Color.BLACK);
        layout.addView(input);

        setContentView(layout);
    }
}
