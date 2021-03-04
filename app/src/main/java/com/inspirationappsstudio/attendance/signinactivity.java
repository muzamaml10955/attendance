package com.inspirationappsstudio.attendance;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class signinactivity extends AppCompatActivity {
Button signinnow;
EditText id,username,password;

    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signinactivity);
id=findViewById(R.id.id);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        signinnow=findViewById(R.id.signinnow);





        signinnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

/*

                HashMap<String, Object> map = new HashMap<>();
                //  map.put("title", title.getText().toString());
                map.put("Username", username.getText().toString());
                map.put("Password", password.getText().toString());

                FirebaseDatabase.getInstance().getReference().child("DATA").push()
                        .setValue(map)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Log.i("tag", "onComplete: ");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("tag", "onFailure: " + e.toString());
                            }
                        }).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.i("tag", "onSuccess: ");
                    }
                });
*/

                HashMap<String, Object> map = new HashMap<>();
                //  map.put("title", title.getText().toString());
                map.put("Username", username.getText().toString());
                map.put("Password", password.getText().toString());
map.put("date",new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date()));
map.put("time",new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date()));
                FirebaseDatabase.getInstance().getReference().child(id.getText().toString()).child("abcd")
                        .setValue(map)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Log.i("tag", "onComplete: ");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.i("tag", "onFailure: " + e.toString());
                            }
                        }).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.i("tag", "onSuccess: ");
                    }
                });


         /* *//*      DatabaseReference myRef = database.getReference( id.getText().toString());*//*
                myRef.setValue("Hello, World!");
                myRef.setValue(username.getText().toString());
                myRef.setValue(password.getText().toString());*/

            }
        });
    }
}