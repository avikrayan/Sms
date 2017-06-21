package in.co.encoders.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button writeSms,inbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inbox = (Button) findViewById(R.id.inbox);
        inbox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inboxintent = new Intent(MainActivity.this,Inbox.class);
                startActivity(inboxintent);
            }
        });

        writeSms = (Button) findViewById(R.id.writesms);
        writeSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent writeintent = new Intent(MainActivity.this,WriteSms.class);
                startActivity(writeintent);
            }
        });
    }
}
