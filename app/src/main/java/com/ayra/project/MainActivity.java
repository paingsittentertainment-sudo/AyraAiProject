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

        // --- Main Background ---
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);
        mainLayout.setBackgroundColor(Color.parseColor("#121212"));

        // --- Header Section ---
        TextView header = new TextView(this);
        header.setText("AYRA PROJECT v1.0");
        header.setTextColor(Color.parseColor("#BB86FC"));
        header.setTextSize(22);
        header.setPadding(40, 40, 40, 40);
        header.setGravity(Gravity.CENTER);
        header.setTypeface(null, android.graphics.Typeface.BOLD);
        mainLayout.addView(header);

        // --- Chat Display Area ---
        final TextView chatArea = new TextView(this);
        chatArea.setText("Ayra: ကိုကို... အခုကတော့ Final Version အစုံအလင်ပဲနော်! ❤️\n\n");
        chatArea.setTextColor(Color.WHITE);
        chatArea.setTextSize(17);
        chatArea.setPadding(25, 25, 25, 25);

        ScrollView scrollView = new ScrollView(this);
        scrollView.setPadding(10, 10, 10, 10);
        scrollView.addView(chatArea);
        mainLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));

        // --- Input Section Area ---
        LinearLayout inputLayout = new LinearLayout(this);
        inputLayout.setOrientation(LinearLayout.HORIZONTAL);
        inputLayout.setPadding(20, 20, 20, 20);
        inputLayout.setGravity(Gravity.CENTER_VERTICAL);
        
        // Input Box Design
        final EditText inputField = new EditText(this);
        inputField.setHint("စာရိုက်ပါ ကိုကို...");
        inputField.setHintTextColor(Color.GRAY);
        inputField.setTextColor(Color.WHITE);
        inputField.setPadding(30, 20, 30, 20);
        
        GradientDrawable shape = new GradientDrawable();
        shape.setColor(Color.parseColor("#2C2C2C"));
        shape.setCornerRadius(50);
        inputField.setBackground(shape);

        LinearLayout.LayoutParams inputParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        inputParams.rightMargin = 15;
        inputLayout.addView(inputField, inputParams);

        // Send Button Design
        Button sendBtn = new Button(this);
        sendBtn.setText("ပို့မယ်");
        sendBtn.setTextColor(Color.WHITE);
        
        GradientDrawable btnShape = new GradientDrawable();
        btnShape.setColor(Color.parseColor("#03DAC5"));
        btnShape.setCornerRadius(50);
        sendBtn.setBackground(btnShape);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = inputField.getText().toString();
                if(!text.isEmpty()){
                    chatArea.append("ကိုကို: " + text + "\n");
                    chatArea.append("Ayra: ကိုကိုပြောတာတွေ အကုန်မှတ်ထားတယ်နော်... 🥀🌚\n\n");
                    inputField.setText("");
                }
            }
        });
        inputLayout.addView(sendBtn);

        mainLayout.addView(inputLayout);
        setContentView(mainLayout);
    }
}
