package lb.edu.aub.cmps297.inventoryapp;

// Maria Hajj
// Main code for the first page which is the categories page

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button addBtn;
    Button inventoryBtn;

    static ListView myList;
    static ArrayList<String> categories = new ArrayList<>();
    static ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addBtn = findViewById(R.id.addItemButton);
        myList = findViewById(R.id.lists);
        inventoryBtn = findViewById(R.id.inventoryButton);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories);
        myList.setAdapter(adapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainActivity.this, AddCatActivity.class);
               startActivity(intent);
            }
        });

        inventoryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, InventoryActivity.class);
                startActivity(intent);
            }
        });
    }
}