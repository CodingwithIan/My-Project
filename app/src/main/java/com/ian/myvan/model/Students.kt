package com.ian.myvan.model

import com.google.firebase.database.Exclude

data class Students(
    var name:String? = null,
    var imageUrl:String? = null,
    var sschool:String? = null,
    var sClass:String? = null,
    var sStation:String? = null,
    var gContact:String? = null,
    var startDate:String? = null,
    var endDate:String? = null,
    var balance:String? = null,
    var description:String? = null,
    @get:Exclude
    @set:Exclude
    var key:String? = null

)