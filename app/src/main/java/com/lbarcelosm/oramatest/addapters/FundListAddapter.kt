package com.lbarcelosm.oramatest.addapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.lbarcelosm.oramatest.R
import com.lbarcelosm.oramatest.models.Fund

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
        return rowView
    }
}