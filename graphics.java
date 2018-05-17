package pksoftFX;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class graphics extends Application{
	TreeView<String> tree;
	
	public static void main(String[] args) {
		
		launch(args);
	}
	 
    @Override  
    public void start(Stage primaryStage) throws Exception {  
    	// aking root
    	TreeItem<String> root, pk, sk;
    	root = new TreeItem<>();
    	root.setExpanded(true);
    	// pk branch
    	pk = maker("PK", root);
    	maker("Android", pk);
    	maker("Apple", pk);
    	maker("Technology", pk);
    	// sk branch
    	sk = maker("SK", root);
         maker("Makeup", sk);
         maker("Modeling", sk);
         maker("Hoper", sk);
         // create tree
         tree = new TreeView<>(root);
         tree.setShowRoot(false);
         tree.getSelectionModel().selectedItemProperty().addListener( (v, oldValue, newValue) ->{
        	 if(newValue!=null) {
        		 System.out.println(newValue.getValue());
        	 }
         });
        StackPane layout = new StackPane();  
          
        layout.getChildren().add(tree);  
        Scene scene = new Scene(layout,700,400);  
        primaryStage.setScene(scene);  
  
        primaryStage.setTitle("Purushottam Kafle");  
        primaryStage.show();  
          
    }  
    public TreeItem<String> maker(String title, TreeItem<String> parent){
    	TreeItem<String> item = new TreeItem<>(title);
    	item.setExpanded(true);
    	parent.getChildren().add(item);
    	return item;
    }
 
}
