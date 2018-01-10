/*package com.pro.util;

import java.io.Serializable;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class Utils implements Serializable{
	
	public static String getPhotoIdTypes() throws Exception{
		String data = "<IdList><Id><IdCode>STA</IdCode>" +
		"<IdLabel>State ID</IdLabel><HasCountry>YES</HasCountry><CountryList>US_AND_PR_ONLY</CountryList>" +
		"<DefaultCountry/><HasState>YES</HasState><IsMasked>NO</IsMasked>" +
		"<IsFromPinPad>NO</IsFromPinPad><HasExpirationDate>NO</HasExpirationDate></Id><Id><IdCode>DLV</IdCode>" +
		"<IdLabel>Driving License</IdLabel><HasCountry>YES</HasCountry><CountryList>US_AND_PR_ONLY</CountryList>" +
		"<DefaultCountry/><HasState>YES</HasState><IsMasked>NO</IsMasked><IsFromPinPad>NO</IsFromPinPad>" +
		"<HasExpirationDate>YES</HasExpirationDate></Id><Id><IdCode>PASS</IdCode><IdLabel>PASSPORT</IdLabel>" +
		"<HasCountry>YES</HasCountry><CountryList>MT_DEFAULT</CountryList><DefaultCountry></DefaultCountry><HasState>NO</HasState>" +
		"<IsFromPinPad>NO</IsFromPinPad><HasExpirationDate>YES</HasExpirationDate></Id><Id><IdCode>BOR</IdCode>" +
		"<IdLabel>Border Crossing</IdLabel><HasCountry>YES</HasCountry><CountryList>MT_DEFAULT</CountryList><DefaultCountry></DefaultCountry>" +
		"<HasState>NO</HasState><IsFromPinPad>NO</IsFromPinPad><HasExpirationDate>NO</HasExpirationDate></Id></IdList>";
		String response = "";
		Object obj = null;
		XStream xstream = new XStream(new StaxDriver());
		xstream.ignoreUnknownElements();

		xstream.alias("IdList", IDType.class);
		xstream.addImplicitCollection(IDType.class, "ids");
		xstream.alias("Id", IDType.class);
		xstream.aliasField("IdCode", IDType.class, "idCode");
		xstream.aliasField("IdLabel", IDType.class, "idLabel");
		xstream.aliasField("HasCountry", IDType.class, "hasCountry");
		xstream.aliasField("CountryList", IDType.class, "countryList");
		xstream.aliasField("DefaultCountry", IDType.class, "defaultCountry");
		xstream.aliasField("HasState", IDType.class, "hasState");
		xstream.aliasField("IsMasked", IDType.class, "isMasked");
		xstream.aliasField("IsFromPinPad", IDType.class, "isFromPinPad");
		xstream.aliasField("HasExpirationDate", IDType.class, "hasExpirationDate");
		obj = xstream.fromXML(data);
		if(obj != null){
		response = new Gson().toJson(obj);
		}

}
*/