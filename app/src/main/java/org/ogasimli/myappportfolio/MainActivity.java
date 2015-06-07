package org.ogasimli.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

/*    final Button buttonAppOne = (Button) findViewById(R.id.buttonAppOne);
    final Button buttonAppTwo = (Button) findViewById(R.id.buttonAppTwo);
    final Button buttonAppThree = (Button) findViewById(R.id.buttonAppThree);
    final Button buttonAppFour = (Button) findViewById(R.id.buttonAppFour);
    final Button buttonAppFive = (Button) findViewById(R.id.buttonAppFive);
    final Button buttonAppSix = (Button) findViewById(R.id.buttonAppSix);*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onItemClick(View view) {
        Toast.makeText(getApplicationContext(),
                "This button will launch "+ view.getContext()+"!", Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
