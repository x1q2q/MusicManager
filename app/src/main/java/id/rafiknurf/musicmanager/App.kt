package id.rafiknurf.musicmanager

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    Scaffold(
        topBar = {
            TopAppBar(
                scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(),
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = Color.Black,
                ),
                title = { Text("Music Manager", style= MaterialTheme.typography.titleLarge) })
        }, content =  {
            Surface(modifier = Modifier.padding(top=it.calculateTopPadding())) {
                Column{
                    Text(
                        text = "Content of the page",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        color = MaterialTheme.colorScheme.primary
                    )
                    ScrollContent(
                        modifier = Modifier.padding(it)
                    )
                }
            }
        }, floatingActionButton = {FabBtn(onClick = {println("Hello")})})
}

@Composable
fun ScrollContent(modifier: Modifier) {
    LazyColumn (modifier = Modifier.fillMaxSize()){
        items(50){ index->
            Card(colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
                modifier = Modifier.fillMaxWidth().padding(10.dp)) {
                Text("Item ke- $index", modifier = Modifier
                    .padding(12.dp),
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp)
            }

        }
    }
}

@Composable
fun FabBtn(onClick: () -> Unit) {
    FloatingActionButton(onClick = {onClick()}) {
        Icon(Icons.Filled.Add, "Add")
    }
}