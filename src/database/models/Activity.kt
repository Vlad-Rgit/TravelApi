package com.travel.database.models

import com.travel.database.tables.Activities
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import java.math.BigDecimal

class Activity(
    id: EntityID<Int>,
) : IntEntity(id)  {

    companion object : IntEntityClass<Activity>(Activities)

    var city by City referencedOn Activities.city
    var name by Activities.name
    var pricePerPax by Activities.pricePerPax
}