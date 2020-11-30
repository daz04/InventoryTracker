package lb.edu.aub.cmps297.inventoryapp;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class addInventoryActivity extends AppCompatActivity{
    ImageView inventoryBtn;
    TextView backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addinventory);

        inventoryBtn = findViewById(R.id.backarrow);
        backBtn = findViewById(R.id.Back);
        inventoryBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(addInventoryActivity.this,InventoryActivity.class);
                startActivity(intent);
            }
        });
        backBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(addInventoryActivity.this,InventoryActivity.class);
                startActivity(intent);
            }
        });


    }

}
