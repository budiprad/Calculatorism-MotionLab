package com.motionlaboratory.calculatorism2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.fathzer.soft.javaluator.DoubleEvaluator;

import java.text.NumberFormat;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    Button satu,dua,tiga,empat,lima,enam,tujuh,delapan,sembilan,nol,tambah,kali,bagi,kurang,del,samadengan,kurbuk,kurtup,titik,ac;
    Button faktorial,euler,akar,pangkat;
    TextView result;
    String displayresult="";
    boolean isSamadengan=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        satu = (Button) findViewById(R.id.one);
        dua = (Button) findViewById(R.id.two);
        tiga = (Button) findViewById(R.id.three);
        empat = (Button) findViewById(R.id.four);
        lima = (Button) findViewById(R.id.five);
        enam = (Button) findViewById(R.id.six);
        tujuh = (Button) findViewById(R.id.seven);
        delapan = (Button) findViewById(R.id.eight);
        sembilan = (Button) findViewById(R.id.nine);
        nol = (Button) findViewById(R.id.zero);

        tambah = (Button) findViewById(R.id.plus);
        kali = (Button) findViewById(R.id.kali);
        kurang = (Button) findViewById(R.id.minus);
        bagi = (Button) findViewById(R.id.devide);

        del = (Button) findViewById(R.id.del);
        samadengan = (Button) findViewById(R.id.equal);
        kurbuk = (Button) findViewById(R.id.burung);
        kurtup = (Button) findViewById(R.id.turung);
        titik = (Button) findViewById(R.id.dot);
        ac = (Button) findViewById(R.id.ac);
        faktorial = (Button) findViewById(R.id.faktorial);
        euler = (Button) findViewById(R.id.euler);
        akar = (Button) findViewById(R.id.akar);
        pangkat = (Button) findViewById(R.id.pangkat);

        result = (TextView)findViewById(R.id.display);
        result.setText(displayresult);
        result.getLayoutParams().width = LinearLayout.LayoutParams.WRAP_CONTENT;

        satu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
//                displayval=Double.parseDouble(displayresult);
//
//                if((displayval % 1) == 0){
//                    displayresult=NumberFormat.getIntegerInstance().format((int)displayval);
//                } else {
//                    displayresult=NumberFormat.getIntegerInstance().format(displayval);
//                }
                if(isSamadengan){
                    displayresult="1";
                    isSamadengan=false;
                } else {
                    displayresult+="1";
                }
                result.setText(displayresult);
            }
        });

        dua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="2";
                    isSamadengan=false;
                } else {
                    displayresult+="2";
                }
                result.setText(displayresult);
            }
        });
        tiga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="3";
                    isSamadengan=false;
                } else {
                    displayresult+="3";
                }
                result.setText(displayresult);
            }
        });
        empat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="4";
                    isSamadengan=false;
                } else {
                    displayresult+="4";
                }
                result.setText(displayresult);
            }
        });
        lima.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="5";
                    isSamadengan=false;
                } else {
                    displayresult+="5";
                }
                result.setText(displayresult);
            }
        });
        enam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="6";
                    isSamadengan=false;
                } else {
                    displayresult+="6";
                }
                result.setText(displayresult);
            }
        });
        tujuh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="7";
                    isSamadengan=false;
                } else {
                    displayresult+="7";
                }
                result.setText(displayresult);
            }
        });
        delapan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="8";
                    isSamadengan=false;
                } else {
                    displayresult+="8";
                }
                result.setText(displayresult);
            }
        });
        sembilan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="9";
                    isSamadengan=false;
                } else {
                    displayresult+="9";
                }
                result.setText(displayresult);
            }
        });
        nol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="0";
                    isSamadengan=false;
                } else {
                    displayresult+="0";
                }
                result.setText(displayresult);
            }
        });

        tambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click

                displayresult+="+";
                result.setText(displayresult);
                isSamadengan=false;
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                displayresult+="-";
                result.setText(displayresult);
                isSamadengan=false;
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                displayresult+="*";
                result.setText(displayresult);
                isSamadengan=false;
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                displayresult+="/";
                result.setText(displayresult);
                isSamadengan=false;
            }
        });

        titik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                displayresult+=".";
                result.setText(displayresult);
                isSamadengan=false;
            }
        });
        kurbuk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="(";
                    isSamadengan=false;
                } else {
                    displayresult+="(";
                }
                result.setText(displayresult);
            }
        });
        kurtup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult=")";
                    isSamadengan=false;
                } else {
                    displayresult+=")";
                }
                result.setText(displayresult);
            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                displayresult="";
                result.setText(displayresult);
                isSamadengan=false;
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                isSamadengan=false;
                if(displayresult != ""){
                    displayresult=displayresult.substring(0, displayresult.length()-1);
                    if(displayresult.length() > 0){
                        result.setText(displayresult);
                    } else {
                        displayresult="";
                        result.setText(displayresult);
                    }

                } else {
                    displayresult="";
                    result.setText(displayresult);
                }

            }
        });

        faktorial.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(displayresult == ""){
                    displayresult="Error!";
                    isSamadengan=false;
                } else {
                    int fakt = Integer.parseInt(displayresult);
                    int hasilfakt=1;
                    for (int i = 1; i <= fakt; i++) {
                        hasilfakt = hasilfakt * i;
                    }
                    displayresult=String.valueOf(hasilfakt);
                }
                isSamadengan=true;
                if(displayresult.length() > 34){
                    result.setText("Exceed Maximum Limit!");
                } else {
                    result.setText(displayresult);
                }

            }
        });

        euler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(isSamadengan){
                    displayresult="e";
                    isSamadengan=false;
                } else {
                    displayresult+="e";
                }
                result.setText(displayresult);
            }
        });

        akar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(displayresult == ""){
                    displayresult="Error!";
                    isSamadengan=false;
                } else {
                    int hasilintakar;
                    Double akar = Double.parseDouble(displayresult);
                    akar = Math.sqrt(akar);
                    displayresult=String.valueOf(Math.sqrt(akar));
                    if (akar == akar.intValue()) {
                        hasilintakar=akar.intValue();
                        displayresult = Integer.toString(hasilintakar);
                    } else {
                        displayresult = akar.toString();
                    }
                }
                isSamadengan=true;
                result.setText(displayresult);
            }
        });

        pangkat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                displayresult+="^";
                result.setText(displayresult);
            }
        });


        samadengan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                if(displayresult != null){
                    int hasilint;
                    // Create a new evaluator
                    DoubleEvaluator evaluator = new DoubleEvaluator();
                    String expression = displayresult;
                    // Evaluate an expression
                    Double hasil = evaluator.evaluate(expression);
                    if (hasil == hasil.intValue()) {
                        hasilint=hasil.intValue();
                        displayresult = Integer.toString(hasilint);
                    } else {
                        displayresult = hasil.toString();
                    }

                    // Ouput the result
                    result.setText(displayresult);
                    isSamadengan=true;
                }

            }
        });

    }
}
