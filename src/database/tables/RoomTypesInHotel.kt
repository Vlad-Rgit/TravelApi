package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Table

object RoomTypesInHotel: IntIdTable() {

    val roomType = reference("roomType", RoomTypes)
    val hotel = reference("hotel", Hotels)
    val pricePerNight = decimal("pricePerNight", 10, 2)
    val amount = integer("amount")

}