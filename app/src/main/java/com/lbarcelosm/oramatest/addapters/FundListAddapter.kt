package com.lbarcelosm.oramatest.addapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.lbarcelosm.oramatest.R
import com.lbarcelosm.oramatest.models.Fund
import java.math.RoundingMode
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class FundListAddapter(private val context: Context,
                       private val dataSource: ArrayList<Fund>) : BaseAdapter() {

    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.fund_item, parent, false)
        val fund = getItem(position) as Fund
        val fundTitulo = rowView.findViewById(R.id.fund_titulo) as TextView
        fundTitulo.text = fund.simple_name
        val fundPercent = rowView.findViewById(R.id.fund_percent) as TextView
        // Como não sei qual a propriedade da % pequei uma qualquer só para exibir um valor para todos os itens
        val valorPercent = fund.volatility_12m.toDouble() * 100
        fundPercent.text = roundOffDecimal(valorPercent).toString() + "% (12 M)"
        val fundValor = rowView.findViewById(R.id.fund_valor) as TextView
        fundValor.text = getValorFormatado(fund.operability.minimum_initial_application_amount)
        return rowView
    }

    fun roundOffDecimal(number: Double): Double? {
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.CEILING
        return df.format(number).toDouble()
    }

    fun getValorFormatado(valor: String) : String {
        val format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        format.setCurrency(Currency.getInstance("BRL"));
        return format.format(valor.toDouble())
    }
}