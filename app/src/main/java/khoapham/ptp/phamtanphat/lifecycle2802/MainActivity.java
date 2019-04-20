package khoapham.ptp.phamtanphat.lifecycle2802;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("BBB","onCreate");
        txt = findViewById(R.id.textview);


        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Manhinh2Activity.class);
                startActivity(intent);
            }
        });

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

    //Neu trở về màn hình trước bằng nút back thì màn hình hiện tại gọi onDestroy
    //Nếu như gọi intent thì màn hình chuyển qua nó sẽ gọi lại từ oncreate
    //Khi chuyển qua màn hình khác màn hình hiện tại không còn lưu dữ liệu thì nên gọi finish() để kết thúc
    @Override
    protected void onDestroy() {
        Log.d("BBB","onDestroy");
        super.onDestroy();
    }
}
