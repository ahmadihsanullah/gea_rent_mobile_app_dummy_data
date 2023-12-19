package il.massive.gea_rent.data.barang

import il.massive.gea_rent.R
import il.massive.gea_rent.data.toko.DataToko
import il.massive.gea_rent.model.BarangModel

object DataBarang {
    val dummyDataBarang = listOf<BarangModel>(
        BarangModel(
            DataToko.dummyTokoData[0],
            "Sepatu Gunung",
            "Desain yang modern dengan berbagai ukuran yang tersedia. Cocok untuk berbagai kegiatan outdoor, dari hiking hingga camping.",
            80000,
            2,
            R.drawable.sepatu,
        ),
        BarangModel(
            DataToko.dummyTokoData[1],
            "Kompor Portable",
            "Desain yang modern dengan berbagai ukuran yang tersedia. Cocok untuk berbagai kegiatan outdoor, dari hiking hingga camping.",
            50000,
            7,
            R.drawable.produk2,
        ),
        BarangModel(
            DataToko.dummyTokoData[2],
            "Terpal",
            "Terpal ukuran 4 x 5, cocok untuk dijadikan alas dalam berkemah agar pakaian dan alat tetap bersih",
            80000,
            2,
            R.drawable.terpal,
        ),
        BarangModel(
            DataToko.dummyTokoData[3],
            "Tenda Dome",
            "Tenda Dome ukuran besar dapat menampun 4-5 orang",
            50000,
            7,
            R.drawable.tenda_dome,
        ),
        BarangModel(
            DataToko.dummyTokoData[4],
            "Sleeping Bad",
            "Slepeping Bad ukuran besar, dengan bahas yang halus dan tebal",
            80000,
            2,
            R.drawable.sleeping_bad,
        ),
        BarangModel(
            DataToko.dummyTokoData[5],
            "Kompor Portable",
            "Desain yang modern dengan berbagai ukuran yang tersedia. Cocok untuk berbagai kegiatan outdoor, dari hiking hingga camping.",
            50000,
            7,
            R.drawable.produk2,
        ),
        BarangModel(
            DataToko.dummyTokoData[3],
            "Sepatu Gunung",
            "Desain yang modern dengan berbagai ukuran yang tersedia. Cocok untuk berbagai kegiatan outdoor, dari hiking hingga camping.",
            80000,
            2,
            R.drawable.sepatu,
        ),
        BarangModel(
            DataToko.dummyTokoData[2],
            "Kompor Portable",
            "Desain yang modern dengan berbagai ukuran yang tersedia. Cocok untuk berbagai kegiatan outdoor, dari hiking hingga camping.",
            50000,
            7,
            R.drawable.produk2,
        ),

    )
}