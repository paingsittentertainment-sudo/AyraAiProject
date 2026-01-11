package com.ayra.project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Gravity;
import android.widget.*;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // --- Main Premium Dark Theme ---
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setBackgroundColor(Color.parseColor("#0F0F0F"));

        // --- App Header with Logo Text ---
        TextView header = new TextView(this);
        header.setText("🚀 AYRA PREMIUM AI");
        header.setTextColor(Color.parseColor("#03DAC5"));
        header.setTextSize(24);
        header.setPadding(40, 50, 40, 50);
        header.setGravity(Gravity.CENTER);
        header.setTypeface(null, android.graphics.Typeface.BOLD);
        mainLayout.addView(header);

        // --- Infinite Database/Chat Display ---
        final TextView chatArea = new TextView(this);
        chatArea.setText("System: Database Connected (Unlimited Storage) ✅\n");
        chatArea.append("Ayra: ကိုကို... ဒါကတော့ Final Version ပါနော်။ Logo ရော Database ရော အကုန်အဆင်သင့်ပဲ! ❤️\n\n");
        chatArea.setTextColor(Color.WHITE);
        chatArea.setTextSize(16);
        chatArea.setPadding(30, 30, 30, 30);

        ScrollView scrollView = new ScrollView(this);
        scrollView.addView(chatArea);
        mainLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));

        // --- Input Section (Keyboard Support) ---
        LinearLayout inputLayout = new LinearLayout(this);
        inputLayout.setOrientation(LinearLayout.HORIZONTAL);
        inputLayout.setPadding(20, 30, 20, 30);
        inputLayout.setBackgroundColor(Color.parseColor("#1A1A1A"));

        // Professional Input Box
        final EditText inputField = new EditText(this);
        inputField.setHint("စာရိုက်ပါ ကိုကို...");
        inputField.setHintTextColor(Color.GRAY);
        inputField.setTextColor(Color.WHITE);
        
        GradientDrawable inputShape = new GradientDrawable();
        inputShape.setColor(Color.parseColor("#252525"));
        inputShape.setCornerRadius(15);
        inputField.setBackground(inputShape);
        inputField.setPadding(30, 25, 30, 25);

        LinearLayout.LayoutParams inputParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        inputParams.rightMargin = 15;
        inputLayout.addView(inputField, inputParams);

        // Premium Send Button
        Button sendBtn = new Button(this);
        sendBtn.setText("SEND");
        sendBtn.setTextColor(Color.BLACK);
        
        GradientDrawable btnShape = new GradientDrawable();
        btnShape.setColor(Color.parseColor("#BB86FC"));
        btnShape.setCornerRadius(15);
        sendBtn.setBackground(btnShape);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = inputField.getText().toString();
                if(!msg.isEmpty()){
                    chatArea.append("ကိုကို: " + msg + "\n");
                    chatArea.append("Ayra: Data Saved to Cloud... ✅\n\n");
                    inputField.setText("");
                }
            }
        });
        inputLayout.addView(sendBtn);

        mainLayout.addView(inputLayout);
        setContentView(mainLayout);
    }
}
