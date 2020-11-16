package com.travel.database.models

import com.travel.database.tables.Countries
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Country(id: EntityID<Int>): IntEntity(id) {
    companion object: IntEntityClass<Country>(Countries)

    var name by Countries.name
}