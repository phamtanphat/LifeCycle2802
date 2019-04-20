package khoapham.ptp.phamtanphat.lifecycle2802;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Manhinh2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("BBB","onCreate-2");

    }

    @Override
    protected void onStart() {
        Log.d("BBB","onStart-2");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d("BBB","onResume-2");
        super.onResume();
        finish();
    }

    //Chi su dung camera
    @Override
    protected void onPause() {
        Log.d("BBB","onPause-2");

        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","onStop-2");
    }

    // do camera tra hinh ve
    // quay lai ung dung
    // man hinh truoc tro ve
    @Override
    protected void onRestart() {
        Log.d("BBB","onRestart-2");
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        Log.d("BBB","onDestroy-2");
        super.onDestroy();
    }
}