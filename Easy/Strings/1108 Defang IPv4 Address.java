/*
1108. Defanging an IP Address
Easy

Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

 

Example 1:

Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
Example 2:

Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"
 

Constraints:

The given address is a valid IPv4 address.

============================


Learning Outcomes:
split() regex
string.concat() doesnt assign value implictly

*/

class Solution1108 {
	public static void main(String args[]) {
		String s = "255.100.50.0";
		defangIPaddr(s);
	}

	public static String defangIPaddr(String address) {
		String[] addressArr = address.split("\\.");
		String answer = "";
		for (int i = 0; i < addressArr.length; i++) {
			answer = answer.concat(addressArr[i]);
			if (i < addressArr.length - 1) {
				answer = answer.concat("[.]");
			}
		}
		return answer;
	}
}