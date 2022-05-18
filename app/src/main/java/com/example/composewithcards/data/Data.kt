package com.example.composewithcards.data

sealed class Data {

    data class Header(val label: String) : Data()

    data class Item(val text: String) : Data()

    data class Footer(val text: String) : Data()
}

val data = listOf(
    Data.Header("Section 1"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Footer("Last Item"),
    Data.Header("Section 2"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Footer("Last Item"),
    Data.Header("Section 3"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Item("Item"),
    Data.Footer("Last Item")
)