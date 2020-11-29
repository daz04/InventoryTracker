package lb.edu.aub.cmps297.inventoryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import static lb.edu.aub.cmps297.inventoryapp.R.id.add_page;

public class AddCatActivity extends AppCompatActivity {

    Button sendAddBtn;
    Button btnCancel;
    EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_category_page);

        sendAddBtn = findViewById(R.id.buttonSend);
        btnCancel = findViewById(R.id.buttonCancel);
        edit = findViewById(R.id.addField);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MainActivity.categories);
        MainActivity.myList.setAdapter(adapter);

        sendAddBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = edit.getText().toString();
                MainActivity.categories.add(result);

                adapter.notifyDataSetChanged();
                finish();
            }
        });

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                setResult(RESULT_CANCELED, resultIntent);
                finish();
            }
        });
    }
}