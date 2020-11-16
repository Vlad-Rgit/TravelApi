package com.travel.database.models

import com.travel.database.tables.RoomTypes
import com.travel.database.tables.RoomTypesInHotel
import org.jetbrains.exposed.dao.Entity
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.id.EntityID

class RoomTypeInHotel(id: EntityID<Int>): IntEntity(id)  {

    var roomType by RoomType referencedOn RoomTypesInHotel.roomType
    var hotel by Hotel referencedOn RoomTypesInHotel.hotel
    var pricePerNight by RoomTypesInHotel.pricePerNight
    var amount by RoomTypesInHotel.amount

}