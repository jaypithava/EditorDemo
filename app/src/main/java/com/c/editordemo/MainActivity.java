package com.c.editordemo;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.BulletSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.QuoteSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jp.wasabeef.richeditor.RichEditor;

public class MainActivity extends AppCompatActivity {

    private boolean isReached = false;

    private RichEditor mEditor;
    ImageButton action_bold,action_italic,action_insert_bullets,action_insert_numbers,action_blockquote
            ,action_heading1,action_heading2,action_heading3,action_heading4,action_heading5,action_heading6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditor=findViewById(R.id.editor);
        mEditor.setEditorHeight(200);
        mEditor.setEditorFontSize(22);
        mEditor.setPadding(10, 10, 10, 10);
        mEditor.setPlaceholder("Type Text Here...");

        action_bold=findViewById(R.id.action_bold);
        action_italic=findViewById(R.id.action_italic);
        action_insert_bullets=findViewById(R.id.action_insert_bullets);
        action_insert_numbers=findViewById(R.id.action_insert_numbers);
        action_blockquote=findViewById(R.id.action_blockquote);
        action_heading1=findViewById(R.id.action_heading1);
        action_heading2=findViewById(R.id.action_heading2);
        action_heading3=findViewById(R.id.action_heading3);
        action_heading4=findViewById(R.id.action_heading4);
        action_heading5=findViewById(R.id.action_heading5);
        action_heading6=findViewById(R.id.action_heading6);

        action_bold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setBold();
            }
        });


        action_italic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setItalic();
            }
        });

        action_insert_bullets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setBullets();
            }
        });

        action_insert_numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setNumbers();
            }
        });

        action_blockquote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




//                SpannableString spannable = new SpannableString(mEditor.getHtml());
//
//                spannable.setSpan(new QuoteSpan(),
//                        8, mEditor.getPaddingStart(),
//                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

                //mEditor.setImeOptions(EditorInfo.IME_ACTION_NEXT);


                mEditor.setBlockquote();

//                if(mEditor.getPaddingStart() == 28 && !isReached) {
////                    mEditor.append("\n");
//                    mEditor.setAlignLeft();
//                    isReached = true;
//                }

//                // if edittext has less than 10chars & boolean has changed, reset
//                if(mEditor.getPaddingStart()< 10 && isReached) isReached = false;{
//                    mEditor.setAlignLeft();
//                }

//                String text =mEditor.toString();
//                String result = "";
//                for (String line : text.split("\n"))
//                {
//                    result += "    " + line + "\n";
//                }
//                mEditor.setAlignLeft();

            }
        });




        action_heading1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(1);
            }
        });

        action_heading2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(2);
            }
        });

        action_heading3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(3);
            }
        });

        action_heading4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(4);
            }
        });

        action_heading5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(5);                  
            }
        });

        action_heading6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mEditor.setHeading(6);
            }
        });

    }
}