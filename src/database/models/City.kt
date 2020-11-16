package com.travel.database.models

import com.travel.database.tables.Cities
import com.travel.database.tables.Countries
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class City(id: EntityID<Int>): IntEntity(id) {
    companion object: IntEntityClass<City>(Cities)

    var name by Cities.name
    var country by Country referencedOn Cities.country
}