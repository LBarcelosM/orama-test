package com.lbarcelosm.oramatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ListView
import com.lbarcelosm.oramatest.addapters.FundListAddapter
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
        val lista = findViewById<ListView>(R.id.lista)
        var service = FundHTTPService().getService()
        val context = this;
        service.getFunds().enqueue(object : Callback<List<Fund>> {
            override fun onResponse(call: Call<List<Fund>>, response: Response<List<Fund>>) {
                if (response.isSuccessful) {
                    lista.adapter = FundListAddapter(context, response.body() as ArrayList<Fund>)
                } else {
                    try {
                        assert(response.errorBody() != null)
                        Log.d("Funds", response.errorBody()!!.string())
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