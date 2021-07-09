package com.lbarcelosm.oramatest

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.lbarcelosm.oramatest.models.Fund

class FundDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fund_details)
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        val fund = intent.getSerializableExtra("fund") as Fund
        val fundTitulo = findViewById(R.id.fund_titulo) as TextView
        fundTitulo.text = fund.fullName
        val fundBenchmark = findViewById(R.id.fund_benchmark) as TextView
        fundBenchmark.text = "Benchmark: ${fund.benchmark.name}"
        val fundPerformanceFee = findViewById(R.id.fund_fee) as TextView
        fundPerformanceFee.text = "Performance Fee: ${fund.fees.performanceFee}"
        val fundTargetAudience = findViewById(R.id.fund_target_audience) as TextView
        fundTargetAudience.text = "Targer Audience: ${fund.description.targetAudience}"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}