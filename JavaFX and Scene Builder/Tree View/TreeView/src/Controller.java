
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {

    @FXML
    private TreeView<String> myTreeView;

    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        TreeItem<String> rooItem = new TreeItem<>("Files", new ImageView(new Image("Folder.png")));

        TreeItem<String> branchItem1 = new TreeItem<>("Pictures");
        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> branchItem3 = new TreeItem<>("pdf");
        TreeItem<String> branchItem4 = new TreeItem<>("music");
        TreeItem<String> branchItem5 = new TreeItem<>("HTML");

        TreeItem<String> leafItem1 = new TreeItem<>("pic1");
        TreeItem<String> leafItem2 = new TreeItem<>("pic2");
        TreeItem<String> leafItem3 = new TreeItem<>("video1");
        TreeItem<String> leafItem4 = new TreeItem<>("video2");
        TreeItem<String> leafItem5 = new TreeItem<>("book1");
        TreeItem<String> leafItem6 = new TreeItem<>("book2");
        TreeItem<String> leafItem7 = new TreeItem<>("music1");
        TreeItem<String> leafItem8 = new TreeItem<>("music2");
        TreeItem<String> leafItem9 = new TreeItem<>("page1");
        TreeItem<String> leafItem10 = new TreeItem<>("page2");
        TreeItem<String> leafItem11 = new TreeItem<>("page3");

        branchItem1.getChildren().addAll(leafItem1,leafItem2);
        branchItem2.getChildren().addAll(leafItem3,leafItem4);
        branchItem3.getChildren().addAll(leafItem5,leafItem6);
        branchItem4.getChildren().addAll(leafItem7,leafItem8);
        branchItem5.getChildren().addAll(leafItem9,leafItem10, leafItem11);

        rooItem.getChildren().addAll(branchItem1,branchItem2,branchItem3,branchItem4,branchItem5);

        //myTreeView.setShowRoot(false);
        myTreeView.setRoot(rooItem);                
    }

    public void selectItem(){

        TreeItem<String> item = myTreeView.getSelectionModel().getSelectedItem();
        if (item != null) {
            //System.out.println(item.getValue());            
        }
    }
}
