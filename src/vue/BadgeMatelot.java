package vue;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgeMatelot extends AnchorPane{
		
		public BadgeMatelot() {
			
			
			//AnchorPane badgeMatelot = new AnchorPane();
			this.setPrefHeight(200);
			this.setPrefWidth(166);
			this.setStyle("-fx-background-color:red");
			

			ImageView ecusson = new ImageView();
			ecusson.setImage(new Image("vue/badge/armoirie.png"));
			this.getChildren().add(ecusson);
			
			ImageView vagues = new ImageView();
			vagues.setImage(new Image("vue/badge/vagues-rondes.png"));
			vagues.setLayoutX(54);
			vagues.setLayoutY(240);
			this.getChildren().add(vagues);
			
			ImageView dauphin = new ImageView();
			dauphin.setImage(new Image("vue/badge/dauphin-bleu.png"));
			dauphin.setLayoutX(70);
			dauphin.setLayoutY(90);
			this.getChildren().add(dauphin);
			
			Label motto = new Label();
			motto.setText("FAIRE FACE");
			motto.setStyle("-fx-font:25px Tahoma; -fx-font-weight:bold; fx-text-fill:white;");
			motto.setLayoutX(87);
			motto.setLayoutY(60);
			this.getChildren().add(motto);
			
		}
}
