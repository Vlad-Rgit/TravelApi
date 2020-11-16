package com.travel.database.models

import com.travel.database.tables.Streets
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Street(id: EntityID<Int>): IntEntity(id) {
    companion object: IntEntityClass<Street>(Streets)

    val name by Streets.name
}