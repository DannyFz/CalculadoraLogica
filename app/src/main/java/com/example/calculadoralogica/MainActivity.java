 package com.example.calculadoralogica;

        import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import android.widget.Toast;


 public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
     }


     public void DosPuntosV(){
         View L=findViewById(R.id.Respuesta);
         TextView Respuesta=(TextView)L;
         Respuesta.setText("");
     }

     public void miclick(View view){
         Button btn=(Button)view;
         String digito=btn.getText().toString();
         View L=findViewById(R.id.Respuesta);
         TextView Respuesta=(TextView)L;
         Respuesta.append(digito);
     }


    /*public void miclick(view view) {

        switch(view.getid()){
            case R.id.btn1:
                toast.makeText(this,"Hola a android", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn2:
              TextView t=(TextView)findViewById(R.id.lbl1);
              t.setText("Cambio titulo");
                break;

            case R.id.rd1:
                break;
        }

    }*/

 }