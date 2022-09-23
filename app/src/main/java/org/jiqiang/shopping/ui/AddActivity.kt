package org.jiqiang.shopping.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.flow.collectLatest
import org.jiqiang.shopping.api.ApiService
import org.jiqiang.shopping.databinding.ActivityAddBinding
import org.jiqiang.shopping.net.ServiceCreators
import org.jiqiang.shopping.ui.vm.AddViewModel
import org.jiqiang.shopping.ui.vm.AddViewModelFactory
import org.jiqiang.shopping.utils.Logs

class AddActivity : AppCompatActivity() {

    private lateinit var addViewModel: AddViewModel
    private lateinit var binding: ActivityAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addViewModel = ViewModelProvider(this, AddViewModelFactory())[AddViewModel::class.java]

        setSupportActionBar(binding.toolbar)

        supportActionBar?.title = "添加监控商品"

        binding.itemIdEdit.setText("16248578021")
        binding.checkIdTv.setOnClickListener {
            addViewModel.getSkuInfo(binding.itemIdEdit.text.toString())
        }


    }
}