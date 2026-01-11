package com.ayra.project;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.BLACK);
        layout.setPadding(20, 20, 20, 20);

        final TextView chatArea = new TextView(this);
        chatArea.setText("Ayra: ကိုကို... ဘာခိုင်းမလို့လဲဟင်?\n\n");
        chatArea.setTextColor(Color.WHITE);
        chatArea.setTextSize(18);

        ScrollView scrollView = new ScrollView(this);
        scrollView.addView(chatArea);
        
        final EditText input = new EditText(this);
        input.setHint("စာရိုက်ပါ...");
        input.setHintTextColor(Color.GRAY);
        input.setTextColor(Color.WHITE);

        Button sendBtn = new Button(this);
        sendBtn.setText("ပို့မယ်");
        sendBtn.setBackgroundColor(Color.parseColor("#8E44AD"));
        sendBtn.setTextColor(Color.WHITE);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txt = input.getText().toString();
                if(!txt.isEmpty()){
                    chatArea.append("ကိုကို: " + txt + "\n");
                    chatArea.append("Ayra: ကိုကိုပြောတာလေး နားထောင်နေတယ်နော်...\n\n");
                    input.setText("");
                }
            }
        });

        layout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        layout.addView(input);
        layout.addView(sendBtn);

        setContentView(layout);
    }
                      }
