package com.demo.s4adk.app.second;

import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartner;

public class ExtendedBusinessPartner extends BusinessPartner {

	private String extRating;
	private String extDescription;

	public String getExtRating() {
		return extRating;
	}

	public void setExtRating(String extRating) {
		this.extRating = extRating;
	}

	public String getExtDescription() {
		return extDescription;
	}

	public void setExtDescription(String extDescription) {
		this.extDescription = extDescription;
	}

}
