package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object HotelPhotos: IntIdTable() {
    val photo = binary("photo")
    val hotel = reference("hotel", Hotels)
}