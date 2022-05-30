package com.example.demo.utils

fun <E> MutableSet<E>.更新する(一番項目: E, 二番項目: E):Boolean = this.remove(一番項目) && this.add(二番項目)