package best.hotrocanbangdinhduong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

/**
 * Created by Admin on 28/09/2017.
 */

public class Mainactivity_layout_4 extends AppCompatActivity {
    private Button btnback4;
    private Button btnnext4;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_4);
        Button btnnext4 = (Button) findViewById(R.id.btn_next);
        btnnext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpnenMainactivity_layout_5();
            }

            private void doOpnenMainactivity_layout_5() {
                Intent myIntent=new Intent(Mainactivity_layout_4.this,Mainactivity_layout_5.class);
                startActivity(myIntent);
            }
        });
        Button btnback4 = (Button) findViewById(R.id.btn_back);
        btnback4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenManactivity_layout_3();
            }

            private void doOpenManactivity_layout_3() {
                Intent myIntent = new Intent(Mainactivity_layout_4.this, Mainactivity_layout_3.class);
                startActivity(myIntent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_4, menu);
        return true;
    }
}
