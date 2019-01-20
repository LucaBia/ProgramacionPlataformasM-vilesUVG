package com.example.gianlucariverabiagioni.lab2restaurante


class MyMenuOrder: MenuOrder {
    override val menuOrder = ArrayList<String>()

    override fun clear() {
        this.menuOrder.clear()
    }

    override fun add(element: String){
        this.menuOrder.add(element)
    }

    override fun del(elementIndex: Int){
        this.menuOrder.removeAt(elementIndex)
    }

    override fun done() {
        this.menuOrder.clear()
    }

}