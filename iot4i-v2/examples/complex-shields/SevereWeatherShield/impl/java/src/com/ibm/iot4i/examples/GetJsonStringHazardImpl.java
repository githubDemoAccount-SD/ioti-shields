/* Generated by Streams Studio: September 12, 2017 at 4:25:06 AM GMT-4 */
package com.ibm.iot4i.examples;


import java.util.Arrays;

import com.ibm.streams.function.model.Function;


public class GetJsonStringHazardImpl  {
    
    @Function(namespace = "com.ibm.iot4i.examples", name = "getJsonStringHazard", description = "", stateful = false)
	public static String getJsonStringHazard(String shieldId, String userId, String[] rawEvents, String actionParams) {
		return "{\"userId\": \"" + userId + "\",\"shieldId\": \"" + shieldId + "\",\"rawEvents\": "
				+ Arrays.toString(rawEvents) + ",\"actionParams\": " + actionParams + "}";
	}
}
