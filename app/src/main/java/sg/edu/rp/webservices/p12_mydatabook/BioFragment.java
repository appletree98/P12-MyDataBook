package sg.edu.rp.webservices.p12_mydatabook;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {
    Button btn;
    TextView tv;
    EditText et;

    public BioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_blank,container,false);

        btn = (Button) view.findViewById(R.id.btnShow);
        tv = (TextView)view.findViewById(R.id.textView);
        et = (EditText) view.findViewById(R.id.etBio);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout passPhrase =
                        (LinearLayout) inflater.inflate(R.layout.wutface, null);
                final EditText etPassphrase = (EditText) passPhrase
                        .findViewById(R.id.etBio);

                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setTitle("Are you sure?")
                            // Set text for the positive button and the corresponding
                            //  OnClickListener when it is clicked
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Toast.makeText(getContext(), "You clicked yes",
                                            Toast.LENGTH_LONG).show();
                                    tv.setText(etPassphrase.getText().toString());
                                }
                            })
                            // Set text for the negative button and the corresponding
                            //  OnClickListener when it is clicked
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    Toast.makeText(getContext(), "You clicked no",
                                            Toast.LENGTH_LONG).show();
                                }
                            });
                    // Create the AlertDialog object and return it
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
            }
        });

        return view;
    }

}
