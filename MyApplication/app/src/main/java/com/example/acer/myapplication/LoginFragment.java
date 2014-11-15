package com.example.acer.myapplication;

/**
 * Created by Acer on 9/11/2014.
 */
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.TextView;


public class LoginFragment extends Fragment{

    private EditText usernameField,passwordField;
    private TextView status;

    public static LoginFragment newInstance() { //static

        LoginFragment fragment = new LoginFragment();
        return fragment;

    }

    public LoginFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        usernameField = (EditText)getActivity().findViewById(R.id.editText1);
        passwordField = (EditText)getActivity().findViewById(R.id.editText2);
        status = (TextView)getActivity().findViewById(R.id.textView6);
        View rootView = inflater.inflate(R.layout.fragment_login, container,
                false);
        return rootView;


    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MyActivity11) activity).onSectionAttached(8);

    }



        public void login(View view){
        String username = usernameField.getText().toString();
        String password = passwordField.getText().toString();
       new SigninActivity(this,status).execute(username,password);
    }
}
