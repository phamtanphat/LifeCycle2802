package khoapham.ptp.phamtanphat.lifecycle2802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate");

    }

    @Override
    protected void onStart() {
        Log.d("BBB","onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("BBB","onResume");
        super.onResume();
        finish();
    }

    //Chi su dung camera
    @Override
    protected void onPause() {
        Log.d("BBB","onPause");

        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop");
    }

    // do camera tra hinh ve
    // quay lai ung dung
    // man hinh truoc tro ve
    @Override
    protected void onRestart() {
        Log.d("BBB","onRestart");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("BBB","onDestroy");
        super.onDestroy();
    }
}
