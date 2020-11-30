package lb.edu.aub.cmps297.inventoryapp;

// Maria Hajj
// Code for the inventory screen
// (appears when the "Inventory" button is clicked on the category screen)

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InventoryActivity extends AppCompatActivity {

    Button catBtn;
    Button addInventoryBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory);

        catBtn = findViewById(R.id.button);
        addInventoryBtn = findViewById(R.id.button3);

        catBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InventoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        addInventoryBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(InventoryActivity.this,addInventoryActivity.class);
                startActivity(intent);
            }
        });
    }
}