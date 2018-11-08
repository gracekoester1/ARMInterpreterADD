package com.example.aweso.arminterpreter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ARMap.init();
        //ARMap.lookupInstruction("ADD").display();
    }

    public void registersButtonPressed(View v)
    {
        Intent i = new Intent(this, RegisterScreen.class);
        this.startActivity(i);
    }

    private String addRegisters(String bin, String bin2)
    {
        return Integer.toBinaryString(Integer.parseInt(bin, 2) +
                Integer.toBinaryString(Integer.parseInt(bin2, 2)));
    }


    public void executeButtonPressed(View v)
    {
        //Read the instruction from the instructionET and appropriately
        //execute it
        //For example, if instructionET contained: ADD X0, X1, X2
        //Your code should grab the value from X1 and X2, add them
        //together, and store the result in X0

        instructionET = (EditText)findViewById(R.id.instructionET);


        Register 1 = this.registerET[1];
        Register 2 = this.registerET[2];

        String register1bin = BinaryValue(Register 1);
        String register2bin = BinaryValue(Register 2);

        String answer = addRegisters(register1bin, register2bin);

        this.theRegisterETs[0].setText("" + ARMap.registers[i].getValue());


    }
}