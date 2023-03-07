package uz.itschool.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.project.Adapter.itemAdapter
import uz.itschool.project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val adapter=itemAdapter(CategoryFood.values())
        binding.rv.adapter = adapter
    }
}