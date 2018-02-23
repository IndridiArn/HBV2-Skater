
package isbhv2.hi.notandi.skater.controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import isbhv2.hi.notandi.skater.R;
import isbhv2.hi.notandi.skater.service.CreateParkRequest;

public class AddSpotActivity extends AppCompatActivity {

    EditText location,isInside,info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_spot1);
        location =(EditText)findViewById(R.id.addLocation);
        isInside =(EditText)findViewById(R.id.addInside);
        info =(EditText)findViewById(R.id.addInfo);

    }

    public void OnReg(View view ){

        String str_location = location.getText().toString();
        String str_isInside = isInside.getText().toString();
        String str_info = info.getText().toString();

        String type = "Create";

        CreateParkRequest createParkRequest = new CreateParkRequest(this);
        createParkRequest.execute(type, str_location, str_isInside,str_info);
        //finish();

    }
    public void OpenReg(View view){
        //startActivity(newIntent(this,newPark.class));
    }
}
