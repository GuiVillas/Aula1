package com.logiclab.aula2

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "INFOTESTE"

    /* ACTIVITY É CRIADA*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.i(TAG, "OnCreate")
    }

    /* ACTIVITY ESTÁ VISÍVEL AO USUÁRIO */
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart")
    }

    /* ACTIVITY ESTÁ PRONTA PARA USO */
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "OnResume")
    }

    /* PAUSA A ACTIVITY*/
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "OnPause")
    }

    /* SAI DA ACTIVITY */
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "OnStop")
    }

    /* ACTIVITY É FECHADA */
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy")
    }
}