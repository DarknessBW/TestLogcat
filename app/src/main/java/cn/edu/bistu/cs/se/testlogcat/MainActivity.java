package cn.edu.bistu.cs.se.testlogcat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private final String tag = "MyTag";
    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Integer i=3;
        String strMsg = "hi";
        Log.v(tag,strMsg);
        */
        Log.v(tag, "Verbose Message");
        Log.d(tag, "Debug Message");
        Log.i(tag, "Info Message");
        Log.w(tag, "Warning Message");
        Log.e(tag, "Error Message");
    }
}
