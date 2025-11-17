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
			this.setCOULEUR(COULEUR.JAUNE);
		
			

			ImageView ecusson = new ImageView();
			this.setArmoirie(ARMOIRIE_FORME.ECUSSON);
			this.getChildren().add(ecusson);
			
			ImageView vagues = new ImageView();
			this.setVagues(FORME_VAGUES.ONDULEES);
			this.getChildren().add(vagues);
			
			ImageView dauphin = new ImageView();
			this.setDauphin(COULEUR_DAUPHIN.ROSE);
			this.getChildren().add(dauphin);
			
			
			
			Label motto = new Label();
			this.setMotto();
			this.getChildren().add(motto);
			
		}
		protected Label motto;
		public void setMotto() {
			
			motto.setStyle("-fx-font:25px Tahoma; -fx-font-weight:bold; fx-text-fill:white;");
			motto.setLayoutX(87);
			motto.setLayoutY(60);
		}
			protected ImageView vagues;
			public enum FORME_VAGUES{RONDES, ONDULEES}
		public void setVagues(FORME_VAGUES forme) {
			
			if(FORME_VAGUES.ONDULEES == forme)
				vagues.setImage(new Image("vue/badge/vagues-ondulees.png"));
			else
				vagues.setImage(new Image("vue/badge/vagues-rondes.png"));
			
			vagues.setLayoutX(54);
			vagues.setLayoutY(240);
		}
		protected ImageView ecusson;
		public enum ARMOIRIE_FORME{RONDE,ECUSSON}
		public void setArmoirie(ARMOIRIE_FORME forme)
		{
			if(ARMOIRIE_FORME.ECUSSON == forme)
				ecusson.setImage(new Image("vue/badge/armoirie.png"));
			else
				ecusson.setImage(new Image("vue/badge/armoirie-ronde.png"));
		}		
		
		protected ImageView dauphin;
		public enum COULEUR_DAUPHIN{BLEU,ROSE}
		public void setDauphin(COULEUR_DAUPHIN couleur) {
			if(COULEUR_DAUPHIN.ROSE == couleur)  dauphin.setImage(new Image("vue/badge/dauphin-rose.png"));
			dauphin.setImage(new Image("vue/badge/dauphin-bleu.png"));
			dauphin.setLayoutX(70);
			dauphin.setLayoutY(90);
			dauphin.setScaleX(-1.5);
			dauphin.setScaleY(1.5);
		}
		public BadgeMatelot auDaphinRose() {
			this.setDauphin(COULEUR_DAUPHIN.ROSE);
			return this;
		}
		public BadgeMatelot auDaphinBleu() {
			this.setDauphin(COULEUR_DAUPHIN.BLEU);
			return this;
		}
		public BadgeMatelot auDauphin(COULEUR_DAUPHIN couleur) {
			this.setDauphin(couleur);
			return this;
		}
		public BadgeMatelot ronde() {
			this.setArmoirie(ARMOIRIE_FORME.RONDE);
			return this;
		}
		public BadgeMatelot medievale() {
			this.setArmoirie(ARMOIRIE_FORME.ECUSSON);
			return this;
		}
		public BadgeMatelot deCouleur(COULEUR couleur) {
			this.setCOULEUR(couleur);
			return this;
		}
		public BadgeMatelot Message(String message) {
			this.setMotto(message);
			return this;
		}
		public BadgeMatelot enVaguelettes() {
			this.setVagues(FORME_VAGUES.ONDULEES);
			return this;
		}
		public BadgeMatelot enVaguelettesRondes() {
			this.setVagues(FORME_VAGUES.RONDES);
			return this;
		}
		public enum COULEUR{ROUGE, BLEU, JAUNE, NOIR}
		public void setCOULEUR(COULEUR couleur) {
			if(COULEUR.ROUGE == couleur)
				this.setStyle("-fx-background-color:red");
			else if(COULEUR.JAUNE == couleur)
				this.setStyle("-fx-background-color:yellow");
			else if(COULEUR.NOIR == couleur)
				this.setStyle("-fx-background-color:black");
			else 
				this.setStyle("-fx-background-color:blue");
		}
		
}
