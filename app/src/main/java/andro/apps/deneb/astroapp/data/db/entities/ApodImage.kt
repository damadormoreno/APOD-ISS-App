package andro.apps.deneb.astroapp.data.db.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity(tableName = "apodImage")
data class ApodImage(@PrimaryKey(autoGenerate = false) @ColumnInfo(name = "date") var date:String,
                     @ColumnInfo(name = "copyrigth") var copyright:String,
                     @ColumnInfo(name = "explanation") var explanation:String,
                     @ColumnInfo(name = "hdurl") var hdurl:String?,
                     @ColumnInfo(name = "media_type") var mediaType:String,
                     @ColumnInfo(name = "title") var title:String,
                     @ColumnInfo(name = "url") var url:String){
    constructor():this("000000","","","","","","")
}