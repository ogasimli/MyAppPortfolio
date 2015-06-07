package org.ogasimli.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Button buttonAppOne = (Button) findViewById(R.id.buttonAppOne);
        Button buttonAppTwo = (Button) findViewById(R.id.buttonAppTwo);
        Button buttonAppThree = (Button) findViewById(R.id.buttonAppThree);
        Button buttonAppFour = (Button) findViewById(R.id.buttonAppFour);
        Button buttonAppFive = (Button) findViewById(R.id.buttonAppFive);
        Button buttonAppSix = (Button) findViewById(R.id.buttonAppSix);
        CharSequence text = null;
        switch (v.getId()) {
            case R.id.buttonAppOne:
                text=buttonAppOne.getText();
                break;
            case R.id.buttonAppTwo:
                text=buttonAppTwo.getText();
                break;
            case R.id.buttonAppThree:
                text=buttonAppThree.getText();
                break;
            case R.id.buttonAppFour:
                text=buttonAppFour.getText();
                break;
            case R.id.buttonAppFive:
                text=buttonAppFive.getText();
                break;
            case R.id.buttonAppSix:
                text=buttonAppSix.getText();
                break;
            default:
                break;
        }
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch "+ text +"!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 10);
        toast.show();
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
