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

public class Mainactivity_layout_5 extends AppCompatActivity {
    private Button btnback5;
    private Button btnnext5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_5);
        Button btnnext5= (Button) findViewById(R.id.btn_next);
        btnnext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenMainactivity_layout_6();
            }

            private void doOpenMainactivity_layout_6() {
                Intent myIntent=new Intent(Mainactivity_layout_5.this,Mainactivity_layout_6.class);
                startActivity(myIntent);
            }
        });
        Button btnback5= (Button) findViewById(R.id.btn_back);
        btnback5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenMainactivity_layout_4();

            }

            private void doOpenMainactivity_layout_4() {
                Intent myIntent=new Intent(Mainactivity_layout_5.this,Mainactivity_layout_4.class);
                startActivity(myIntent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_5, menu);
        return true;
    }
}