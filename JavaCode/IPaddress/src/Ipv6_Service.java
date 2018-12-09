import java.math.BigInteger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.net.util.SubnetUtils;
import org.apache.commons.net.util.SubnetUtils.SubnetInfo;

import com.googlecode.ipv6.IPv6Address;
import com.googlecode.ipv6.IPv6Network;
import java.math.BigInteger;

public class Ipv6_Service {
	
	public  ArrayList<IPv6_result> Ipv6(String netVal, String ip, String mask,String orig) {
		IPv6Network net = IPv6Network.fromString(netVal);	
		ArrayList<IPv6_result>  arr = new ArrayList<>();		
		String network = network(net);		
		String boradCast = boardCast(net);	
		String pefixs = prefix(net);
		String netmask =  netmask(net);
        String number = numberOfAddress(net);
		
		BigInteger asd = ipv6ToNumber(orig);
		String IntegerID = ""+asd;
		System.out.println(IntegerID);
		
		String hexadecimalID = hex(orig) ;
	
		

		arr.add(new IPv6_result(network,pefixs,number,boradCast,IntegerID,hexadecimalID));
	     
        return arr;
	}
	
	
	public String hex(String orig) {
		String hexadecimalID="";
		String[] hexadecimal = orig.split(":");
		for(int i = 0; i< hexadecimal.length ;i++) {
			hexadecimalID +=  hexadecimal[i];
		}	
		hexadecimalID = "0x"+hexadecimalID.toLowerCase();
		return hexadecimalID;
	}
	public String numberOfAddress(IPv6Network net) {
		BigInteger numberOfAddresses = new BigInteger("2").pow(128 - net.getNetmask().asPrefixLength());
		numberOfAddresses = numberOfAddresses.subtract(new BigInteger("2"));
	    
		String number = ""+numberOfAddresses;
		return number;
	}
	public String netmask(IPv6Network net) {
		String netmask =  net.getNetmask().asAddress().toString();
		return netmask;
	}
	public String boardCast(IPv6Network net) {
		String boradCast = net.getFirst().toLongString() +" - "+ net.getLast().toLongString();
		return boradCast;
	}
	
	public String prefix(IPv6Network net) {
		int pefix = net.getNetmask().asPrefixLength();
		String pefixs = Integer.toString(pefix);
		return pefixs;
	}
	public String network(IPv6Network net) {
		String network = net.getFirst().toLongString() + "/" + net.getNetmask().asPrefixLength();
		return  network;
	}

	public byte hexToByte(String s) {
		byte b = (byte) ((Character.digit(s.charAt(0), 16) << 4) + Character.digit(s.charAt(1), 16));
		return b;
	}
	public static BigInteger ipv6ToNumber(String addr) {
	    int startIndex = addr.indexOf("::");
	    if (startIndex != -1) {
	        String firstStr = addr.substring(0, startIndex);
	        String secondStr = addr.substring(startIndex + 2, addr.length());
	        BigInteger first = new BigInteger("0");
	        BigInteger second = new BigInteger("0");
	        if (!firstStr.equals("")) {
	            int x = countChar(addr, ':');
	            first = ipv6ToNumber(firstStr).shiftLeft(16 * (7 - x));
	        }
	        if (!secondStr.equals("")) {
	            second = ipv6ToNumber(secondStr);
	        }
	        first = first.add(second);
	        return first;
	    }

	    String[] strArr = addr.split(":");
	    BigInteger retValue = BigInteger.valueOf(0);
	    for (int i = 0; i < strArr.length; i++) {
	        BigInteger bi = new BigInteger(strArr[i], 16);
	        retValue = retValue.shiftLeft(16).add(bi);
	    }
	    return retValue;
	}

	public static int countChar(String str, char reg){
	    char[] ch=str.toCharArray();
	    int count=0;
	    for(int i=0; i<ch.length; ++i){
	        if(ch[i]==reg){
	            if(ch[i+1]==reg){
	                ++i;
	                break;
	            }
	            ++count;
	        }
	    }
	    return count;
	}

}
