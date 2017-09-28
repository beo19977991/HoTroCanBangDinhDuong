package best.hotrocanbangdinhduong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import static best.hotrocanbangdinhduong.R.id.btn_back;

/**
 * Created by Admin on 27/09/2017.
 */

public class Mainactivity_layout_2 extends AppCompatActivity {
    private Button btnback2;
    private Button btnnext2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_2);
        Button btnnext2 = (Button) findViewById(R.id.btn_next);
        btnnext2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                doOpenMainactivity_layout_3();
            }

            private void doOpenMainactivity_layout_3() {
                Intent myIntent=new Intent(Mainactivity_layout_2.this,Mainactivity_layout_3.class);
                startActivity(myIntent);
            }
        });

        Button btnback2 = (Button) findViewById(btn_back);
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doOpenMainactivity_layout_1();

            }
        });
    }

            private void doOpenMainactivity_layout_1() {
                Intent myIntent=new Intent(Mainactivity_layout_2.this,Mainactivity_layout_1.class);
                startActivity(myIntent);
            }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_1, menu);
        return true;
    }



}
