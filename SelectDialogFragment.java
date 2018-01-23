package com.example.admin.hist;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Admin on 23.01.2018.
 */

public class SelectDialogFragment extends android.support.v4.app.DialogFragment {

    public static Toast toast;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                MainActivity callingActivity = (MainActivity) getActivity();
                callingActivity.onUserSelectValue(which);

                toast.makeText(getActivity(),Integer.toString(which),Toast.LENGTH_SHORT).show();
                dialogInterface.dismiss();
            }
        };

        builder.setTitle("Test")
                .setItems(R.array.paragrafslist, onClickListener);

        builder.setNegativeButton("CANCEL", onClickListener);

        return builder.create();
    }
}
