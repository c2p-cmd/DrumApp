package org.practice.drum.drums

import javafx.scene.media.AudioClip

val drumSounds = mapOf(
    Pair("w", AudioClip(
        DrumsMain::class.java.getResource("sounds/tom1.mp3")!!.toExternalForm()
    )),
    Pair("a", AudioClip(
        DrumsMain::class.java.getResource("sounds/tom2.mp3")!!.toExternalForm()
    )),
    Pair("s", AudioClip(
        DrumsMain::class.java.getResource("sounds/tom3.mp3")!!.toExternalForm()
    )),
    Pair("d", AudioClip(
        DrumsMain::class.java.getResource("sounds/tom4.mp3")!!.toExternalForm()
    )),
    Pair("j", AudioClip(
        DrumsMain::class.java.getResource("sounds/snare.mp3")!!.toExternalForm()
    )),
    Pair("k", AudioClip(
        DrumsMain::class.java.getResource("sounds/crash.mp3")!!.toExternalForm()
    )),
    Pair("l", AudioClip(
        DrumsMain::class.java.getResource("sounds/kick-bass.mp3")!!.toExternalForm()
    ))
)