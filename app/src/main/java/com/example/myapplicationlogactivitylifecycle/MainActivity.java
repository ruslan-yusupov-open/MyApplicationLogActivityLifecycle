package com.example.myapplicationlogactivitylifecycle;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String methodName = "onCreate";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onStart() {
        String methodName = "onStart";

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
        super.onStart();
    }

    @Override
    protected void onResume() {
        String methodName = "onResume";
        super.onResume();

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onPause() {
        String methodName = "onPause";
        super.onPause();

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onStop() {
        String methodName = "onStop";
        super.onStop();

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onDestroy() {
        String methodName = "onDestroy";
        super.onDestroy();

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onRestart() {
        String methodName = "onRestart";
        super.onRestart();

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        String methodName = "onPostCreate";
        super.onPostCreate(savedInstanceState);

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    protected void onPostResume() {
        String methodName = "onPostResume";
        super.onPostResume();

        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        String methodName = "onKeyDown";
        Log.d("Lifecycle", methodName + " " + keyCode);
        if (textView != null) textView.append("\n" + methodName + " " + keyCode);

        return super.onKeyDown(keyCode, event);
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        String methodName = "onKeyLongPress";
        Log.d("Lifecycle", methodName + " " + keyCode);
        if (textView != null) textView.append("\n" + methodName + " " + keyCode);

        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        String methodName = "onBackPressed";
        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);

        super.onBackPressed();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        String methodName = "onSaveInstanceState";
        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);


        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        String methodName = "onRestoreInstanceState";
        Log.d("Lifecycle", methodName);
        if (textView != null) textView.append("\n" + methodName);


        super.onRestoreInstanceState(savedInstanceState);
    }
}
