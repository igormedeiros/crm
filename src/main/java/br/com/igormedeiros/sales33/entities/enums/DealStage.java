package br.com.igormedeiros.sales33.entities.enums;

public enum DealStage {
	
	NEW("New"),
	QUALIFIED("Qualified"),
	PROPOSAL("Proposal"),
	NEGOTIATION("Negotiation"),
	CLOSED_WOW("Closed Won"),
	CLOSED_LOST("Closed Lost");
	
	private String stage;

	DealStage(String stage) {
		this.stage = stage;
	}

	public String getStage() {
		return stage;
	}

}
