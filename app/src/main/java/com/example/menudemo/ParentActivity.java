package com.example.menudemo;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ParentActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        // Determine which menu option was selected
        if (item.getItemId() == R.id.action_add) {
            // Add selected
            return true;
        }
        else if (item.getItemId() == R.id.action_logout) {
            // Logout selected
            return true;
        }
        else if (item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(ParentActivity.this, MainActivity2.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
