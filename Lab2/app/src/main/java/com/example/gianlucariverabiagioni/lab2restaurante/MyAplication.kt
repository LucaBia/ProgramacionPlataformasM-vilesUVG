package com.example.gianlucariverabiagioni.lab2restaurante

import android.app.Application

class MyAplication: Application() {
    private var orderM : MyMenuOrder = MyMenuOrder()

    fun getOrder() : MyMenuOrder{
        return this.orderM
    }

    fun setOrder(order: MyMenuOrder){
        this.orderM = order
    }
}