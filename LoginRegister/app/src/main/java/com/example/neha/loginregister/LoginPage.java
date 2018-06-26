package com.example.neha.loginregister;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    ImageView backbtn,image_facebook;
    EditText email,password;
    Button login_btn;
    TextView forgot_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);



        backbtn=(ImageView)findViewById(R.id.backbutton);
        image_facebook=(ImageView)findViewById(R.id.facebook);
        email=(EditText)findViewById(R.id.edit_email);
        password=(EditText)findViewById(R.id.edit_Password);
        login_btn=(Button)findViewById(R.id.log_btn);
        forgot_txt=(TextView)findViewById(R.id.text_Password);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eEmail=email.getText().toString();
                String ePassword=password.getText().toString();
            }
        });

    }
}
