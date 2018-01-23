package com.example.admin.hist;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;
import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //AlertDialog.Builder alertDialog;
    final String LOG_TAG ="";
    DialogMenu alertDialog;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button selectItem = (Button) findViewById(R.id.getMenu);
        selectItem.setOnClickListener(this);

        Log.d(LOG_TAG, "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View view) {

        //alertDialog = new DialogMenu(this);


        //TextFragment.currentLayout = R.layout.image_fragment;

        FragmentManager fm = getSupportFragmentManager();
        SelectDialogFragment dialog = new SelectDialogFragment();
        dialog.show(fm,"fragment");


        //alertDialog.show();

    }

    public void onUserSelectValue(Integer selectedValue) {


    }

}
