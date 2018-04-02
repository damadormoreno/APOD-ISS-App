package andro.apps.deneb.astroapp.data.db

import andro.apps.deneb.astroapp.data.db.daos.ApodImageDao
import andro.apps.deneb.astroapp.data.db.entities.ApodImage
import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

@Database(entities = arrayOf(ApodImage::class), version = 1)
abstract class ApodDatabase : RoomDatabase() {
    /*// --- SINGLETON ---
    @Volatile var INSTANCE: ApodDatabase? = null*/

    // --- DAO ---
    abstract fun apodImageDao(): ApodImageDao

/*    companion object {
        private var INSTANCE: ApodDatabase? = null

        fun getInstance(context: Context): ApodDatabase? {
            if (INSTANCE == null) {
                synchronized(ApodDatabase::class) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            ApodDatabase::class.java, "apoddatabase.db")
                            .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }*/
}