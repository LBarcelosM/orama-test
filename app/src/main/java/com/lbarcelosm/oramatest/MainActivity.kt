package com.lbarcelosm.oramatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.lbarcelosm.oramatest.models.Fund
import com.lbarcelosm.oramatest.services.FundHTTPService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val texto = findViewById<TextView>(R.id.texto)
        texto.text = "Testando!!!"
        var service = FundHTTPService().getService()
        service.getFunds().enqueue(object : Callback<List<Fund>?> {
            override fun onResponse(call: Call<List<Fund>?>, response: Response<List<Fund>?>) {
                if (response.isSuccessful) {
                    var funds = response.body()
                    Log.d("Funds Totais", funds?.size.toString())
                } else {
                    try {
                        assert(response.errorBody() != null)
                        Log.d("Founds", response.errorBody()!!.string())
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }

            override fun onFailure(call: Call<List<Fund>?>, t: Throwable) {
                t.printStackTrace()
            }
        })
    }
}