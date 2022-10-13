module com.supdeco.rmi_album_photo_java_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.supdeco.rmi_album_photo_java_fx to javafx.fxml;
    exports com.supdeco.rmi_album_photo_java_fx;
}