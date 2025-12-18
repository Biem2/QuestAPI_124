package com.example.questapi_124.apiservice

import com.example.questapi_124.modeldata.DataSiswa
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface ServiceApiSiswa {
    @GET(value = "bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST(value = "insertTM.php")
    suspend fun porstSiswa(@Body dataSiswa: DataSiswa): retrofit2.Response<Void>

    //@GET(value = "baca1Teman.php/{id}")
    //suspend fun getStatusSiswa(@Query ("id") id: Int): DataSiswa

    //@PUT(value = "editTM.php/{id}")
    //suspend fun editStatusSiswa(@Query ("id") id: Int): DataSiswa

    //@DELETE(value = "deleteTM.php/{id}")
    //suspend fun hapusStatusSiswa(@Query ("id") id: Int): DataSiswa
}