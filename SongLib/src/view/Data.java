package view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import java.io.IOException;

public class Data
{
    @FXML
    private VBox vBox;
    @FXML
    private Label lblSongItemName;
    @FXML
    private Label lblSongItemArtist;

    public Data()
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SongLibCellLayout2.fxml"));
        fxmlLoader.setController(this);
        try
        {
            fxmlLoader.load();
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void setInfo(SongMetadata songItem)
    {
    	lblSongItemName.setText(songItem.getSongName());
    	lblSongItemArtist.setText(songItem.getSongArtist());
    }
    
    
    public VBox getBox()
    {
        return vBox;
    }
}