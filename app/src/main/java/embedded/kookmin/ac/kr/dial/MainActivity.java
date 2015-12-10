package embedded.kookmin.ac.kr.dial;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.File;

public class MainActivity extends AppCompatActivity {

        Button btweb;
        Button btdail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btweb = (Button) findViewById(R.id.bt_1);
        btdail = (Button) findViewById(R.id.bt_2);

        btweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                Uri u = Uri.parse("http://google.com");
                i.setData(u);
                startActivity(i);
            }
        });

        btdail.setOnClickListener(new View.OnClickListener(){
            @Override
        public void onClick(View v){
                Intent d= new Intent(Intent.ACTION_VIEW,Uri.parse("tel:010-6275-3445"));
                startActivity(d);
            }
        });


    }
}
