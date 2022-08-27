package com.company.untitled72.entity

import com.haulmont.cuba.core.entity.StandardEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Table(name = "UNTITLED72_PHONE")
@javax.persistence.Entity(name = "untitled72_Phone")
open class Phone : StandardEntity() {

    @Column(name = "PHONE_NUMBER", nullable = false, unique = true)
    var phoneId: Int ? = null

    @Column(name = "MODEL")
    var model: String ? = null

        @Column(name = "COMPANY")
    var company: String ? = null

    @Column(name = "PRICE")
    var price: Int ? = null


    companion object {
        private const val serialVersionUID = 6862205274258654006L
    }
}