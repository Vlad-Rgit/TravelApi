package com.travel.dto

data class CountryDto(
    var id: Int,
    var name: String
) {
    constructor(): this(0, "")
}