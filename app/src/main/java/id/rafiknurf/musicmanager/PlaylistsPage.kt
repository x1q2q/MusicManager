package id.rafiknurf.musicmanager

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true, widthDp = 400)
@Composable
fun Playlists() {
    val txtStyle = TextStyle(
        color = Color.White,
        fontFamily= FontFamily.Default,
        fontWeight= FontWeight.Normal,
        fontSize=16.sp
    )
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier= Modifier.padding(16.dp)) {
        Text("Contoh Judul1",
            style= MaterialTheme.typography.headlineMedium.copy(color= Color.White),
            fontWeight = FontWeight.Bold,
            modifier= Modifier
                .clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
                .background(MaterialTheme.colorScheme.primary)
                .padding(16.dp)
        )
        Spacer(modifier= Modifier.height(16.dp))
        Text("Deskripsi Banyak banget",style=txtStyle,
            modifier= Modifier
                .background(MaterialTheme.colorScheme.secondary)
                .padding(16.dp)
        )
        Spacer(Modifier.height(16.dp))
        Card(modifier= Modifier.size(height = 240.dp, width = 480.dp)){
            Image(painter = painterResource(R.drawable.pattern ), contentDescription = "image pattern",
                modifier= Modifier.fillMaxSize(), contentScale = ContentScale.FillWidth)
        }
        Spacer(Modifier.height(16.dp))
    }
}