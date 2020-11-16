package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable

object HotelFacilities: IntIdTable() {
    val name = varchar("name", 50)
    val icon = binary("icon")
}