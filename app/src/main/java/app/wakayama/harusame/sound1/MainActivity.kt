package app.wakayama.harusame.sound1

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ドラムサウンドを読み込んでプレーヤーを作る
        val drumSound = MediaPlayer.create(this,R.raw.drum_sound)//Rはresのこと。.でパスを表している

//        val drumImage = findViewById(R.id.drumImage)
        drumImage.setOnClickListener{
            drumSound.seekTo(0)
            drumSound.start()
        }
    }
}