package com.devproject.miguelfagundez.customalertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Members
    private Button btnShowDialog;
    private CustomDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();
        setupListeners();
    }

    private void setupViews() {
        btnShowDialog = findViewById(R.id.btnShowDialog);
        dialog = new CustomDialog(MainActivity.this);
    }

    private void setupListeners() {
        btnShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.showDialog();
            }
        });
    }
}
