package phund.com.notification_demo_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (intent != null) {
            String body = intent.getStringExtra("body");
            System.out.println("Foreground = " + body);
            Toast.makeText(this, body, Toast.LENGTH_SHORT).show();
        }
    }
}
