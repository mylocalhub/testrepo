package com.demo.s4adk.app.second;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.sap.cloud.sdk.s4hana.datamodel.odata.helper.Order;
import com.sap.cloud.sdk.s4hana.datamodel.odata.namespaces.businesspartner.BusinessPartner;
import com.sap.cloud.sdk.s4hana.datamodel.odata.services.DefaultBusinessPartnerService;

public class BPExtensionProcessor {

	private static final String CATEGORY_PERSON = "1";

	public static List<ExtendedBusinessPartner> genertaeBPExtension(List<BusinessPartner> businessPartners) {
		List<ExtendedBusinessPartner> extBusinessPartners = new ArrayList<ExtendedBusinessPartner>();
		try {
			if (businessPartners != null) {
				for (int i = 0; i < businessPartners.size(); i++) {
					BusinessPartner objBP = businessPartners.get(i);
					if (objBP != null) {
						ExtendedBusinessPartner objExtBP = new ExtendedBusinessPartner();
						objExtBP.setLastName(objBP.getLastName());
						objExtBP.setFirstName(objBP.getFirstName());
						objExtBP.setIsMale(objBP.getIsMale());
						objExtBP.setIsFemale(objBP.getIsFemale());
						objExtBP.setCreationDate(objBP.getCreationDate());
						objExtBP.setBusinessPartner(objBP.getBusinessPartner());
						objExtBP.setExtRating("R: " + new Random(1).nextInt() + "");
						objExtBP.setExtDescription("Description" + new Random().nextDouble() + "");

						extBusinessPartners.add(objExtBP);
					}
				}
			}
		} catch (Exception exp) {

		}
		return extBusinessPartners;
	}
}
