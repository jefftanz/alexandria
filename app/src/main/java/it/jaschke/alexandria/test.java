//package it.jaschke.alexandria;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//
//import com.google.zxing.integration.android.IntentIntegrator;
//import com.google.zxing.integration.android.IntentResult;
//
///**
// * Created by jeff on 9/4/15.
// */
//public class test extends Activity {
//
//    private Button mButton;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        // Scanner
//
//        mButton = (Button) findViewById(R.id.assistant_button);
//        mButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                IntentIntegrator integrator = new IntentIntegrator(MainActivity.this);
//                integrator.initiateScan();
//            }
//        });
//    }
//
//    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        IntentResult scanResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
//        if (scanResult != null) {
//            String re = scanResult.getContents();
//            Log.d("code", re);
//        }
//        // else continue with any other code you need in the method
//
//    }
//}
