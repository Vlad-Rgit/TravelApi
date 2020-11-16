package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object CityPhotos: IntIdTable() {
    val city = reference("city", Cities)
    val photo = binary("photo")
}