module org.practice.drum.drums {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires javafx.media;


    opens org.practice.drum.drums to javafx.fxml;
    exports org.practice.drum.drums;
}