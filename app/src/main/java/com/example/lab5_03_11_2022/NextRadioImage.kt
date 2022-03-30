package com.example.lab5_03_11_2022

class NextRadioImage {
    private val allRadioImages: RadioImages = RadioImages()
    private var img: Int = 0
    private val totalImgs: Int = allRadioImages.radioImages.size

    public fun linearNextImage(): String {
        img = (img + 1) % totalImgs
        return allRadioImages.radioImages[img]
    }
}