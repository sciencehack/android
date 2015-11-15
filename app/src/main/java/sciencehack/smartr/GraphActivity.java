package sciencehack.smartr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        if (checkBox.isChecked()) {
            checkBox.setChecked(false);
        }

        final CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        if (checkBox2.isChecked()) {
            checkBox2.setChecked(false);
        }

        final CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        if (checkBox3.isChecked()) {
            checkBox3.setChecked(false);
        }

        final CheckBox checkBox4 = (CheckBox) findViewById(R.id.checkBox3);
        if (checkBox4.isChecked()) {
            checkBox4.setChecked(false);
        }

        checkBox.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO:SHOW
                    }
                }
        );
        checkBox2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO:SHOW
                    }
                }
        );

        checkBox3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO:SHOW
                    }
                }
        );
        checkBox4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //TODO:SHOW
                    }
                }
        );


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_graph, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
