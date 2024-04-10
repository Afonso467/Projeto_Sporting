import android.R
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        // Carrega a animação de entrada
        val fadeScaleInAnimation =
            AnimationUtils.loadAnimation(this, R.anim.fade_scale_in_animation)

        // Encontra a ImageView do logotipo do Sporting
        val imageViewSportingLogo = findViewById<ImageView>(R.id.imageViewSportingLogo)

        // Aplica a animação à ImageView
        imageViewSportingLogo.startAnimation(fadeScaleInAnimation)
    }
}