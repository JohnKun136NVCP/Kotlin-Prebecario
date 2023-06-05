package proteco.com.mx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"OnCreate",Toast.LENGTH_SHORT).show()

    }
    /*fun enviarMesaje(view: View){
        val texto = view.contentDescription.toString()
        if(texto=="quintilliza"){
            Toast.makeText(this,"Hey hola",Toast.LENGTH_SHORT).show()
        }
    }*/
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