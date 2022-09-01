package br.com.igti.segundoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.btn_enviar)
        botao.setOnClickListener {
            enviarMensagem()
        }
    }

    fun enviarMensagem() {
        val mensagem = findViewById<EditText>(R.id.et_CaixaDeMensagem).text.toString()
        val intent = Intent(this,MensagemActivity::class.java).apply {
            putExtra(BUNDLE_KEY,mensagem)
        }
        startActivity(intent)
        }
}