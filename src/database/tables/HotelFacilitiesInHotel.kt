package com.travel.database.tables

import org.jetbrains.exposed.dao.id.IntIdTable
import org.jetbrains.exposed.sql.Table

object HotelFacilitiesInHotel: IntIdTable() {

    val hotel = reference("hotel", Hotels)
    val hotelFacility = reference("hotelFacility", HotelFacilities)
    val isFree = bool("isFree")
    val price = decimal("price", 10, 2).nullable()

}