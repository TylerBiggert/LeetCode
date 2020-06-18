/*
Write a function to check whether an input string is a valid IPv4 address or IPv6 address or neither.

IPv4 addresses consists of four decimal numbers
Ranging from 0 to 255
Separated by dots (".")
e.g.,172.16.254.1;
Leading zeros is invalid

IPv6 addresses consists of eight groups of four hexadecimal digits
Each group representing 16 bits.
The groups are separated by colons (":")
e.g., 2001:0db8:85a3:0000:0000:8a2e:0370:7334
leading zeros ok
case insensitive
e.g., 2001:db8:85a3:0:0:8A2E:0370:7334

don't replace a consecutive group of zero value with two consecutive colons (::)
e.g., 2001:0db8:85a3::8A2E:0370:7334 is an invalid IPv6 address.

Note: You may assume there is no extra space or special characters in the input string.

Example 1:
Input: "172.16.254.1"

Output: "IPv4"

Explanation: This is a valid IPv4 address, return "IPv4".
Example 2:
Input: "2001:0db8:85a3:0:0:8A2E:0370:7334"

Output: "IPv6"

Explanation: This is a valid IPv6 address, return "IPv6".
Example 3:
Input: "256.256.256.256"

Output: "Neither"

Explanation: This is neither a IPv4 address nor a IPv6 address.


========================================================

Learning Outcomes:


*/

import java.lang.Long;

class SolutionvalidIPAddress {
	public static void main(final String args[]) {
		final String IP = "172.16.254.1";
		validIPAddress(IP);
	}

	public static String validIPAddress(final String IP) {

		// verify IP is valid size and has appropriate symbol
		if (IP.length() < 6 || IP.length() > 39 || !(IP.contains(":") || IP.contains("."))) {
			return "Neither";
		}

		if (IP.contains(".") && IP.contains(":")) {
			return "Neither";
		}

		// IPv4 check
		if (IP.contains(".")) {
			final String[] splitIP = IP.split(".");
			for (int i = 0; i < splitIP.length; i++) {
				if (splitIP[i].length() > 4 || splitIP[i].length() == 0) {
					return "Neither";
				}
				if (Integer.parseInt(splitIP[i]) > 255) {
					return "Neither";
				}
				if (splitIP[i].matches(".*[a-zA-Z]+.*")) {
					return "Neither";
				}
				if (splitIP[i].charAt(0) == '0') {
					return "Neither";
				}
			}
			return "IPv4";
		}

		// IPv6 check
		if (IP.contains(":")) {
			final String[] splitIP = IP.split(":");
			if (splitIP.length != 8) {
				return "Neither";
			}
			for (int i = 0; i < splitIP.length; i++) {
				if (splitIP[i].length() == 0 || splitIP[i].length() > 4) {
					return "Neither";
				}
				try {
					Long.parseLong(splitIP[i], 16);

				} catch (NumberFormatException e) {
					return "Neither";
				}
			}
			return "IPv6";
		}
		return IP;
	}
}





