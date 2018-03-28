package com.example.ochieng_derrick.project_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class projone extends AppCompatActivity implements View.OnClickListener{
     Button send, withdraw;
     EditText et;
     TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_projone);

        send = (Button) findViewById(R.id.send);
        withdraw = (Button) findViewById(R.id.withdraw);
        et = (EditText) findViewById(R.id.amountInput);
        display = (TextView) findViewById(R.id.display);

        send.setOnClickListener(this);
        withdraw.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.send:
               String amountSend = et.getText().toString();
               int inputSend = Integer.parseInt(amountSend);


                   break;

            case R.id.withdraw:
                String amountWithdraw = et.getText().toString();
                int inputWithdraw = Integer.parseInt(amountWithdraw);

                if (inputWithdraw<= 50)
                {
                    display.setText("Limited Funds");
                }

                else if (inputWithdraw >= 60 && inputWithdraw <= 100)
                {
                    display.setText("Ksh. 10");
                }

                else if (inputWithdraw >= 101 && inputWithdraw <= 2500)
                {
                    display.setText("Ksh. 27");
                }

                else if (inputWithdraw >= 2501 && inputWithdraw <= 3500)
                {
                    display.setText("Ksh. 49");
                }

                else if (inputWithdraw >= 3501 && inputWithdraw <= 5000)
                {
                    display.setText("Ksh. 66");
                }

                else if (inputWithdraw >= 5001 && inputWithdraw <= 7500)
                {
                    display.setText("Ksh. 82");
                }

                else if (inputWithdraw >= 7501 && inputWithdraw <= 10000)
                {
                    display.setText("Ksh. 110");
                }

                else if (inputWithdraw >= 10001 && inputWithdraw <= 15000)
                {
                    display.setText("Ksh. 159");
                }

                else if (inputWithdraw >= 15001 && inputWithdraw <= 20000)
                {
                    display.setText("Ksh. 176");
                }

                else if (inputWithdraw >= 20001 && inputWithdraw <= 35000)
                {
                    display.setText("Ksh. 187");
                }

                else if (inputWithdraw >= 35001 && inputWithdraw <= 40000){
                    display.setText("Ksh. 275");
                }

                else if(inputWithdraw >= 50001 && inputWithdraw <= 70000){
                    display.setText("Ksh. 330");
                }

                else if(inputWithdraw > 70000){
                    display.setText("Amount too High");
            }

                break;
        }
    }
}
