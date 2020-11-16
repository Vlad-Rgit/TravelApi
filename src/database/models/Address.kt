package com.travel.database.models

import com.travel.database.tables.Addresses
import org.jetbrains.exposed.dao.IntEntity
import org.jetbrains.exposed.dao.IntEntityClass
import org.jetbrains.exposed.dao.id.EntityID

class Address(id: EntityID<Int>): IntEntity(id) {
    companion object: IntEntityClass<Address>(Addresses)

    var country by Country referencedOn Addresses.country
    var city by City referencedOn Addresses.city
    var street by Street referencedOn Addresses.street
    var buildingNumber by Addresses.buildingNumber
    var corpusNumber by Addresses.corpusNumber
}