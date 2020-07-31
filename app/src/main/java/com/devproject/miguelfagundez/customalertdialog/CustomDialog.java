package com.devproject.miguelfagundez.customalertdialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;

public class CustomDialog {

    // Members
    private Activity activity;
    private AlertDialog dialog;

    // Constructor
    public CustomDialog(Activity customActivity) {
        activity = customActivity;
    }

    public void showDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);

        LayoutInflater inflater = activity.getLayoutInflater();

        //-- First custom alert dialog
        //builder.setView(inflater.inflate(R.layout.custom_dialog, null));

        //-- Second custom alert dialog
        builder.setView(inflater.inflate(R.layout.custom_dialog_two, null));

        builder.setCancelable(true);

        dialog = builder.create();
        dialog.show();
    }
}
