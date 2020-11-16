package com.travel.database.models

import com.travel.database.tables.HotelFacilities
import com.travel.database.tables.HotelFacilitiesInHotel
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class HotelFacilityInHotel(id: EntityID<Int>): IntEntity(id) {

    companion object: IntEntityClass<HotelFacilityInHotel>(HotelFacilitiesInHotel)

    var hote by Hotel referencedOn HotelFacilitiesInHotel.hotel
    var hotelFacility by HotelFacility referencedOn HotelFacilitiesInHotel.hotelFacility
    var isFree by HotelFacilitiesInHotel.isFree
    var price by HotelFacilitiesInHotel.price
}