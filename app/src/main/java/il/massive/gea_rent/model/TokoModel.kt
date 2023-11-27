package il.massive.gea_rent.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TokoModel(
    val image: Int,
    val nama: String,
    val alamat: String,
    val telpon: String
):Parcelable
