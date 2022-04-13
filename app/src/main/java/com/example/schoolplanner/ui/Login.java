package com.example.schoolplanner.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.schoolplanner.ClientThread;
import com.example.schoolplanner.MainActivity;
import com.example.schoolplanner.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText username=findViewById(R.id.Username);
        EditText password=findViewById(R.id.Password);

        Button logInBtn=findViewById(R.id.btn_Login);

        logInBtn.setOnClickListener(view -> {
            String Username = username.getText().toString();
            String Password = password.getText().toString();

            System.out.println(Username + Password);

            String Message = Username+"-"+Password;

            ClientThread clt = new ClientThread(Message);
            try{
                clt.start();
                GoToMain();
            }
            catch (Exception E)
            {

            }


        });
    }
    public void GoToMain()
    {
        Intent intent=new Intent(this, MainActivity.class);

        startActivity(intent);
    }

}