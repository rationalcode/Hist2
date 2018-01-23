package com.example.admin.hist;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;
import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;


/**
 * Created by Admin on 16.01.2018.
 */

public class DialogMenu extends AlertDialog {

String onClickItem;
    public   Toast toast;

public static String LOG_TAG = "";

    protected DialogMenu(final Context context) {
        super(context);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);

        OnClickListener onClickListener = new OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                toast.makeText(context, "show",LENGTH_SHORT);
                toast.show();
                dialogInterface.dismiss();
            }
        };

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                context, R.array.paragrafslist,
                android.R.layout.simple_list_item_1);

        alertDialog.setAdapter(adapter,onClickListener);
        alertDialog.setTitle("Содержание");
        //alertDialog.setNegativeButton("cancel", onClickListener);
        alertDialog.create();
        alertDialog.show();



    }





}
