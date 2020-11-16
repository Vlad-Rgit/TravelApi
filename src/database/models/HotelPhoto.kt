package com.travel.database.models

import com.travel.database.tables.HotelPhotos
import com.travel.database.tables.Hotels
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class HotelPhoto(
    id: EntityID<Int>
): IntEntity(id) {

    companion object: IntEntityClass<HotelPhoto>(HotelPhotos)

    var photo by HotelPhotos.photo
    var hotel by Hotel referencedOn HotelPhotos.hotel
}