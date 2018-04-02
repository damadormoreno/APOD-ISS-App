package andro.apps.deneb.astroapp.data.db.daos

import andro.apps.deneb.astroapp.data.db.entities.ApodImage
import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import java.util.*

@Dao
interface ApodImageDao {
    @Query("SELECT * from APODIMAGE")
    fun getAll(): LiveData<List<ApodImage>>

    @Query("DELETE from APODIMAGE")
    fun deleteAll()

    @Query("select * from APODIMAGE where date =:date")
    fun getApodByDate(date: String): LiveData<ApodImage>

   /* @Query("select * from apodImage where date=:date and lastRefresh > :lastRefreshMax limit 1")
    fun hasApodImage(date: String, lastRefreshMax: Date): LiveData<ApodImage>*/

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertApodImage(apodImage: ApodImage)

    @Delete
    fun deleteApodImage(apodImage: ApodImage)

    @Update
    fun updateApodImage(apodImage: ApodImage)


}