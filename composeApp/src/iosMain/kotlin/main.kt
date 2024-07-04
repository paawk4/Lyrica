import androidx.compose.ui.window.ComposeUIViewController
import com.github.paawk4.lyrica.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
