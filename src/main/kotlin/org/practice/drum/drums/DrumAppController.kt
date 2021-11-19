package org.practice.drum.drums

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.image.ImageView

import java.net.URL
import java.util.*

const val OUT_OF_FOCUS_STYLE = "-fx-background-color: WHITE; -fx-background-radius: 25; " +
                               "-fx-border-color: #404B69; -fx-border-width: 10px; -fx-border-radius: 15;"
const val IN_FOCUS_STYLE     = "$OUT_OF_FOCUS_STYLE -fx-opacity: 0.4;"

class DrumApp : Initializable{
    @FXML
    lateinit var w: ImageView
    lateinit var a: ImageView
    lateinit var s: ImageView
    lateinit var d: ImageView
    lateinit var j: ImageView
    lateinit var k: ImageView
    lateinit var l: ImageView
    lateinit var wLabel: Label
    lateinit var aLabel: Label
    lateinit var sLabel: Label
    lateinit var dLabel: Label
    lateinit var jLabel: Label
    lateinit var kLabel: Label
    lateinit var lLabel: Label

    override fun initialize(url: URL?, resourceBundle: ResourceBundle?) {
        // adding respective images to ImageViews
        val drums = listOf(wLabel,sLabel,aLabel,dLabel,jLabel,kLabel,lLabel)
        val drumMap = mapOf(
            Pair("w", wLabel),
            Pair("a", aLabel),
            Pair("s", sLabel),
            Pair("d", dLabel),
            Pair("j", jLabel),
            Pair("k", kLabel),
            Pair("l", lLabel)
        )

        for (drumLabel in drums) {
            // Mouse Event Handler
            drumLabel.setOnMousePressed {
                drumSounds[drumLabel.text.lowercase()]?.play()
                drumMap[drumLabel.text.lowercase()]?.style = IN_FOCUS_STYLE
            }
            drumLabel.setOnMouseReleased {
                drumMap[drumLabel.text.lowercase()]?.style = OUT_OF_FOCUS_STYLE
            }
            drumLabel.setOnMouseEntered {
                drumMap[drumLabel.text.lowercase()]?.style = IN_FOCUS_STYLE
            }
            drumLabel.setOnMouseExited {
                drumMap[drumLabel.text.lowercase()]?.style = OUT_OF_FOCUS_STYLE
            }

            // KeyBoard Event Handler
            drumLabel.isFocusTraversable = true

            drumLabel.setOnKeyPressed { keyEvent ->
                drumSounds[keyEvent.text.lowercase()]?.play()
                drumMap[keyEvent.text.lowercase()]?.style = IN_FOCUS_STYLE
            }
            drumLabel.setOnKeyReleased { keyEvent ->
                drumMap[keyEvent.text.lowercase()]?.style = OUT_OF_FOCUS_STYLE
            }
        }
    }
}