package com.neppplus.library_20210731

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        인터넷에 있는 이미지를 glideTestImg 에 반영
        Glide.with(this).load("http://dimg.donga.com/wps/NEWS/IMAGE/2019/12/31/99024137.2.jpg").into(glideTestImg)

        photoImg.setOnClickListener {

            val myIntent = Intent(this, ViewPhotoDetailActivity::class.java)
            startActivity(myIntent)

        }


//        callBtn.setOnClickListener {
//
////            1. 권한이 있는지 없는지에 따라, 어떻게 행동할지. 방침 저장.
//            val permissionListener = object : PermissionListener {
//
//                override fun onPermissionGranted() {
//
////                    권한이 OK 되었을때
////                    예시 => 실제 전화 연결 진행. Intent(4)
//
//                    val myUri = Uri.parse("tel:01011112222")
//                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
//                    startActivity(myIntent)
//
//                }
//
//                override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {
//
////                    권한이 최종 거부되었을때
////                    예시 => 전화 걸기 실패 안내 토스트.
//
//
////                    this : object 를 가리키게 될 수도 있다. => MainActivity라고 명확히 표시.
//                    Toast.makeText(this@MainActivity, "권한이 거절되어 통화가 불가능합니다.", Toast.LENGTH_SHORT).show()
//
//                }
//
//            }
//
////            실제 권한 확인 기능 실행.
//            TedPermission.with(this)
//                .setPermissionListener( permissionListener )
//                .setPermissions(Manifest.permission.CALL_PHONE)
//                .setDeniedMessage("[설정] 에서 전화 권한을 허용해야 연결이 가능합니다.")
//                .check()
//
//        }

    }
}