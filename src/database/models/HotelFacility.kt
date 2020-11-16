package com.travel.database.models

import com.travel.database.tables.HotelFacilities
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class HotelFacility(id: EntityID<Int>): IntEntity(id) {

    companion object: IntEntityClass<HotelFacility>(HotelFacilities)

    var name by HotelFacilities.name
    var icon by HotelFacilities.icon
}