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
		
			

			ecusson = new ImageView();
			this.setArmoirie(ARMOIRIE_FORME.ECUSSON);
			this.getChildren().add(ecusson);
			
		    vagues = new ImageView();
			this.setVagues(FORME_VAGUES.ONDULEES);
			this.getChildren().add(vagues);
			
			pomme = new ImageView();
			this.setPomme(COULEUR_POMME.ROUGE);
			this.getChildren().add(pomme);
			
			
			
			motto = new Label();
			this.setMotto("FAIRE FACE");
			motto.setStyle("-fx-font:25px Tahoma; -fx-font-weight:bold;-fx-text-fill:white;");
			motto.setLayoutX(87);
			motto.setLayoutY(60);
			this.getChildren().add(motto);
			
		}
		protected Label motto;
		public void setMotto(String message) {
			
			motto.setText(message);
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
		
		protected ImageView pomme;
		public enum COULEUR_POMME{VERT,ROUGE}
		public void setPomme(COULEUR_POMME couleur) {
			if(COULEUR_POMME.ROUGE == couleur)  pomme.setImage(new Image("vue/badge/PommeRouge.png"));
			pomme.setImage(new Image("vue/badge/pommeVert.png"));
			pomme.setLayoutX(-450);
			pomme.setLayoutY(-450);
			pomme.setScaleX(0.1);
			pomme.setScaleY(0.1);
		}
		public BadgeMatelot auPommeRose() {
			this.setPomme(COULEUR_POMME.ROUGE);
			return this;
		}
		public BadgeMatelot auPommeBleu() {
			this.setPomme(COULEUR_POMME.VERT);
			return this;
		}
		public BadgeMatelot auPomme(COULEUR_POMME couleur) {
			this.setPomme(couleur);
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
