


//package com.example.doctorapp
//
//import android.os.Bundle
//import android.view.MenuItem
//import androidx.appcompat.app.ActionBarDrawerToggle
//import androidx.appcompat.app.AppCompatActivity
//import androidx.appcompat.widget.Toolbar
//import androidx.drawerlayout.widget.DrawerLayout
//import com.google.android.material.navigation.NavigationView
//
//class DashboardActivity : AppCompatActivity() {
//    private lateinit var drawerLayout: DrawerLayout
//    private lateinit var navigationView: NavigationView
//    private lateinit var toolbar: Toolbar
//    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_dashboard)
//
//        // تحديد الـ toolbar بعد استدعاء setContentView
//        toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)
//
//        // الآن يمكن استخدام المتغيرات بعد تحديدها بشكل صحيح
//        drawerLayout = findViewById(R.id.drawer)
//
//        // قم بإنشاء ActionBarDrawerToggle بعد تحديد drawerLayout
//        actionBarDrawerToggle = ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close)
//        drawerLayout.addDrawerListener(actionBarDrawerToggle)
//        actionBarDrawerToggle.syncState()
//        }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
//            true
//        } else {
//            super.onOptionsItemSelected(item)
//        }
//        }
//}