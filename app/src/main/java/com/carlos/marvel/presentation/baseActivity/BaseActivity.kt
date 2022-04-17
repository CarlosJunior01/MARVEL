package com.carlos.marvel.presentation.baseActivity

import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.carlos.marvel.R
import com.carlos.marvel.presentation.about.AboutActivity
import kotlinx.android.synthetic.main.activity_marvel.*

/**
 * Created by CarlosJr
 */

open class BaseActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.marvel -> {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.marvel.com"))
                startActivity(browserIntent)
                Toast.makeText(this, "Marvel", Toast.LENGTH_SHORT).show()
            }

            R.id.about -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show()
            }
            R.id.sair, R.id.sair2 -> {

                val builder =
                    AlertDialog.Builder(this, android.R.style.Theme_Material_Light_Dialog_Alert)

                builder.setTitle("Sair")
                builder.setMessage("Deseja encerrar a aplicação?")
                builder.setPositiveButton("SIM") { dialog, which ->
                    Toast.makeText(
                        applicationContext,
                        "Saindo.",
                        Toast.LENGTH_SHORT
                    ).show()
                    finishAffinity()
                    Toast.makeText(this, "Encerrando aplicação.", Toast.LENGTH_SHORT).show()
                }

                builder.setNegativeButton("NÃO") { dialog, which ->
                    Toast.makeText(applicationContext, "Não selecionado!", Toast.LENGTH_SHORT)
                        .show()
                }

                val dialog: AlertDialog = builder.create()

                dialog.show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
    protected fun setupToolbar(
        toolbar: androidx.appcompat.widget.Toolbar,
        titleIdRes: Int,
        backButton: Boolean = false
    ){
        toolbar.title = getString(titleIdRes)
        setSupportActionBar(toolbar)
        if(backButton)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}