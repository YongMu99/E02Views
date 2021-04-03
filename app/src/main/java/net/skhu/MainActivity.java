package net.skhu;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_signUp) {
            Intent intent = new Intent(this, SignupActivityTest.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_memo) {
            Intent intent = new Intent(this, MemoActivityTest.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.action_buttons) {
            Intent intent = new Intent(this, ButtonsActivityTest.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_checkboxes) {
            Intent intent = new Intent(this, CheckboxesActivityTest.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
