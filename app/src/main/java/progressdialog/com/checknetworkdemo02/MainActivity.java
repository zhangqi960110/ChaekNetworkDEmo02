package progressdialog.com.checknetworkdemo02;

import android.content.Intent;
import android.net.Network;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, NetworkStateService.class);
        startService(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
