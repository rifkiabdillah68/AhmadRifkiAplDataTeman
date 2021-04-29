package com.example.aplikasidatateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend("Ahmad Rifki Abdillah", jkel = "Laki-laki", email = "rifki@me.com", telp = "098308754987", alamat = "Malang"))
        listTeman.add(MyFriend(nama = "Dhiya Ulhaq Dazakiyyah", jkel = "Laki-laki", email = "ulhaq@you.com", telp = "9834793874", alamat = "Blitar"))
        listTeman.add(MyFriend(nama = "Oky MIkhael", jkel = "Laki-laki", email = "oky@you.com", telp = "0819834793874", alamat = "Tulungagung"))
        listTeman.add(MyFriend(nama = "Widya Retnaning Pratiwi", jkel = "Perempuan", email = "widya@you.com", telp = "0859834793874", alamat = "Kediri"))
        listTeman.add(MyFriend(nama = "Indra Oky Sandi", jkel = "Laki-laki", email = "indra@you.com", telp = "02134793874", alamat = "Jombang"))
        listTeman.add(MyFriend(nama = "I Komang Damai Armawan", jkel = "Laki-laki", email = "komang@you.com", telp = "088834793874", alamat = "Mojokerto"))
        listTeman.add(MyFriend(nama = "Daud Ridho Ilahi", jkel = "Laki-laki", email = "daud@you.com", telp = "082834793874", alamat = "Batu"))
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}