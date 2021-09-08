package br.com.will.todolist.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.will.todolist.R

class NewTaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_task)
    }
}