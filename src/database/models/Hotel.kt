package com.travel.database.models

import com.travel.database.tables.Hotels
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Hotel(
    id: EntityID<Int>
) : IntEntity(id) {
    companion object: IntEntityClass<Hotel>(com.travel.database.tables.Hotels)

    var name by Hotels.name
}