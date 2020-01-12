package com.isil.appcalificacion;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText n1,n2,n3;
    TextView resultado;
    double nt1,nt2,nt3,suma,promedio;

    DecimalFormat df=new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=findViewById(R.id.txtn1);
        n2=findViewById(R.id.txtn2);
        n3=findViewById(R.id.txtn3);
        resultado=findViewById(R.id.txtresultado);
    }
    public void calcular(View view) {
        String msg="";
        if (!n1.getText().toString().isEmpty() && !n2.getText().toString().isEmpty() && !n3.getText().toString().isEmpty()) {
            nt1 = Double.parseDouble(n1.getText().toString());
            nt2 = Double.parseDouble(n2.getText().toString());
            nt3 = Double.parseDouble(n3.getText().toString());

        } else {
            msg = "Complete los campos";
            resultado.setText(msg);
        }
        if(nt1<0 || nt1>20 ||  nt2<0 || nt2>20 ||nt3<0 || nt3>20){
            msg="Calificacion Invalida";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }
        if(msg.isEmpty()){
            suma=nt1+nt2+nt3;
            promedio=suma/3;

            resultado.setText(df.format(promedio));
        }

    }

        }


