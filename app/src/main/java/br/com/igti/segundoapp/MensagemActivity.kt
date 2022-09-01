package br.com.igti.segundoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MensagemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mensagem)
        receberMensagem()
    }

    fun receberMensagem(){
        val mensagem = intent.getStringExtra(BUNDLE_KEY)
        findViewById<TextView>(R.id.tvMensagem).text = mensagem

    }
}