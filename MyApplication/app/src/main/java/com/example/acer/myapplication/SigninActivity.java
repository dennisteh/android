package com.example.acer.myapplication;

/**
 * Created by Acer on 10/11/2014.
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.TextView;

public class SigninActivity extends AsyncTask<String,Void,String> {
    private TextView statusField;
    private LoginFragment context;



    public SigninActivity( LoginFragment context,TextView statusField  ) {
       this.context = context;
        //public SigninActivity(LoginFragment context, TextView statusField  ) {
        this.statusField = statusField;

    }

    protected void onPreExecute(){

    }
    @Override
    protected String doInBackground(String... arg0) {

            try{
                String username = (String)arg0[0];
                String password = (String)arg0[1];
                String link="http://myktv.webatu.com/login.php";
                String data  = URLEncoder.encode("username", "UTF-8")
                        + "=" + URLEncoder.encode(username, "UTF-8");
                data += "&" + URLEncoder.encode("password", "UTF-8")
                        + "=" + URLEncoder.encode(password, "UTF-8");
                URL url = new URL(link);
                URLConnection conn = url.openConnection();
                conn.setDoOutput(true);
                OutputStreamWriter wr = new OutputStreamWriter
                        (conn.getOutputStream());
                wr.write( data );
                wr.flush();
                BufferedReader reader = new BufferedReader
                        (new InputStreamReader(conn.getInputStream()));
                StringBuilder sb = new StringBuilder();
                String line = null;
                // Read Server Response
                while((line = reader.readLine()) != null)
                {
                    sb.append(line);
                    break;
                }
                return sb.toString();
            }catch(Exception e){
                return new String("Exception: " + e.getMessage());
            }

    }
    @Override
    protected void onPostExecute(String result){
        this.statusField.setText("Login Successful");

    }
}