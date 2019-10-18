package com.anangbudiapk.presiden_indo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview =  findViewById<ListView>(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir soekarno", "Presiden Pertama", R.drawable.ir))
        list.add(Model("Soeharto", "Presiden Kedua", R.drawable.sh))
        list.add(Model("BJ Habibie", "Presiden Ketiga", R.drawable.hb))
        list.add(Model("Abdurrahman Wahid", "Presiden Keempat", R.drawable.gs))
        list.add(Model("Megawati", "Presiden Kelima", R.drawable.mg))
        list.add(Model("Susilo Bambang Yudhoyono", "Presiden Keenam", R.drawable.sby))
        list.add(Model("Joko Widodo", "Presiden Ketujuh", R.drawable.jk))

        listview.adapter = MyAdapter(this, R.layout.row, list)

        listview.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0 ){
                Toast.makeText(this@MainActivity, "Dr. Ir. H. Soekarno adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia yang terjadi pada tanggal 17 Agustus 1945. Dr. Ir. H. Soekarno adalah Presiden pertama Republik Indonesia yang menjabat pada periode 1945–1967. Ia memainkan peranan penting dalam memerdekakan bangsa Indonesia dari penjajahan Belanda. Ia adalah Proklamator Kemerdekaan Indonesia yang terjadi pada tanggal 17 Agustus 1945.", Toast.LENGTH_LONG).show()
            }
            if (position == 1 ){
                Toast.makeText(this@MainActivity, " H. M. Soeharto, (Jawa Kuno: Suharta; Jawa Latin: Suhartå; Hanacaraka:ꦯꦸꦲꦂꦠ ) (ER, EYD: Suharto) (lahir di Kemusuk, Yogyakarta, 8 Juni 1921 – meninggal di Jakarta, 27 Januari 2008 pada umur 86 tahun) adalah Presiden kedua Indonesia yang menjabat dari tahun 1967 sampai 1998", Toast.LENGTH_LONG).show()
            }
            if (position == 2 ){
                Toast.makeText(this@MainActivity, "Prof. Dr. Ing. H. Bacharuddin Jusuf Habibie, FREng adalah Presiden Republik Indonesia yang ketiga. Sebelumnya, B.J. Habibie menjabat sebagai Wakil Presiden Republik Indonesia ke-7, menggantikan Try Sutrisno. B. J. Habibie menggantikan Soeharto yang mengundurkan diri dari jabatan presiden pada tanggal 21 Mei 1998.", Toast.LENGTH_LONG).show()
            }
            if (position == 3 ){
                Toast.makeText(this@MainActivity, "Pertama kali belajar, Gus Dur kecil belajar pada sang kakek, K.H. Hasyim Asy'ari. Saat serumah dengan kakeknya, ia diajari mengaji dan membaca al-Qur'an. Dalam usia lima tahun ia telah lancar membaca al-Qur'an. Pada saat sang ayah pindah ke Jakarta, di samping belajar formal di sekolah, Gus Dur masuk juga mengikuti les privat Bahasa Belanda. ", Toast.LENGTH_LONG).show()
            }
            if (position == 4 ){
                Toast.makeText(this@MainActivity, "Bernama Lengkap Diah Permata Megawati Setiawati Soekarnoputri atau akrab di sapa Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947.", Toast.LENGTH_LONG).show()
            }
            if (position == 5 ){
                Toast.makeText(this@MainActivity, "Jenderal TNI (Purn) Susilo Bambang Yudhoyono adalah presiden Republik Indonesia keenam. Berbeda dengan presiden sebelumnya, Susilo Bambang Yudhoyono merupakan presiden pertama yang dipilih secara langsung oleh rakyat dalam proses Pemilu Presiden putaran II 20 September 2004.", Toast.LENGTH_LONG).show()
            }
            if (position == 6 ){
                Toast.makeText(this@MainActivity, "Jokowi dilahirkan dengan nama lengkap Joko Widodo. Ia lahir di Surakarta, 21 Juni 1961. Ia merupakan Putera dari pasangan Noto Mihardjo dan Sudhiatmi dan anak sulung dari empat bersaudara.", Toast.LENGTH_LONG).show()
            }
        }
    }
}
