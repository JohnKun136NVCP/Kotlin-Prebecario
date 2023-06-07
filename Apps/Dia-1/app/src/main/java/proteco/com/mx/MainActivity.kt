package proteco.com.mx

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show()

    }
    //ImageBotton poner funcionalidades a los botones.
    fun enviarMesaje(view: View){
        val texto = view.contentDescription.toString()
        if(texto=="quintilliza" || texto=="五等分"){ //En el caso que el idioma cambie
            Toast.makeText(this,"Hey Yahooo!",Toast.LENGTH_SHORT).show()
        }else if (texto=="My hero academia"||texto=="僕のヘロアカデミア"){
            Toast.makeText(this,"My hero Academia",Toast.LENGTH_SHORT).show()
        }
    }
    //Redireccionar a internet y después cambiar el botón (Así funcionan los anuncios xd)
    fun botonInternet(view: View){ //Funcionalidad del boton llamando a todos los atributos de view
        val botonCambia = findViewById<Button>(R.id.boton1) //Buscar por un ID
        botonCambia.setOnClickListener{ //Estar atento cuando de click
            Toast.makeText(this,"Plus Ultra",Toast.LENGTH_LONG).show() //Muestra un mensaje
            val i  = Intent(Intent.ACTION_VIEW, Uri.parse("https://heroaca.com")) //Abre la pagina
            botonCambia.backgroundTintList = getColorStateList(android.R.color.holo_green_dark) //Cambia el color del boton
            startActivity(i) //Cuando empieza la pantalla principal o la actividad
        }
    }
    //Ciclo de vida de una APP
    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"OnStart",Toast.LENGTH_SHORT).show()

    }
    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"OnResume",Toast.LENGTH_SHORT).show()

    }
    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"OnPause",Toast.LENGTH_SHORT).show()

    }
    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"OnStop",Toast.LENGTH_SHORT).show()

    }
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"OnDestroy",Toast.LENGTH_SHORT).show()

    }

}