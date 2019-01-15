package com.chhemsronglong.together.DataModel

import android.util.Log
import com.google.android.gms.maps.model.LatLng
import com.google.firebase.database.Exclude
import com.google.firebase.database.ServerValue
import java.util.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.time.LocalDateTime

data class Message(

        var fromUserId : String = "",
        var toUserId : String = "",
        var content : String = "",
        var mainChatId : String = "",
        val timestamp: Long = System.currentTimeMillis(),
        @get:Exclude val id: String = ""
        )


