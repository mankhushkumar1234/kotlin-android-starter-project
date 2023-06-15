// ktlint-disable filename
package com.delasign.samplestarterproject

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.delasign.samplestarterproject.coordinators.languageCoordinator.LanguageCoordinator
import com.delasign.samplestarterproject.models.languageContent.UIContent
import com.delasign.samplestarterproject.ui.styleguide.HeaderText
import com.delasign.samplestarterproject.ui.styleguide.theme.AppTheme

fun MainActivity.setupUI() {
    val currentContent: UIContent = LanguageCoordinator.shared.currentContent ?: return
    setContent {
        AppTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background,
            ) {
                Greeting(currentContent.sample.sampleString)
//                SampleComposableWithReceiver(name = "Hello !", modifier = Modifier.defaultMinSize())
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    HeaderText(
        copy = "Hello $name!",
        modifier = modifier,
        color = MaterialTheme.colorScheme.primary,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTheme {
        Greeting("Android")
    }
}
