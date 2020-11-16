package com.travel.database.models

import com.travel.database.tables.RoomTypes
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class RoomType(id: EntityID<Int>): IntEntity(id) {

    companion object: IntEntityClass<RoomType>(RoomTypes)

    var name by RoomTypes.name
}