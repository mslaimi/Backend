package com.sogeti.formation;

public class Video extends Media {
private int vLength;
private String nbVisualisation;
private String classification;

public Video(String title, String creator, String creationYear, boolean availability, int vLength, String classification) {
	super( title,  creator,  creationYear, availability);
	this.vLength = vLength;
	this.classification = classification;
}

public int getvLength() {
	return vLength;
}

public void setvLength(int vLength) {
	this.vLength = vLength;
}

public String getNbVisualisation() {
	return nbVisualisation;
}

public void setNbVisualisation(String nbVisualisation) {
	this.nbVisualisation = nbVisualisation;
}

public String getClassification() {
	return classification;
}

public void setClassification(String classification) {
	this.classification = classification;
}


}
