package Pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class package Pro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Pro62 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		
		System.out.println("Enter the String");
		
		String s1 = br.readLine();
		int length = s1.length();
		int start=0;
		for(int i=2;i<=length;i++){
			start = 0;
			int ss = i;
			int limit = length-(ss-1);
			for(int i1=0;i1<limit;i1++){
				String s2 = s1.substring(start , ss);
				start ++; ss++;
				System.out.println(s2);
				l1.add(s2);
				
			}
		}
		for(int i=0;i<l1.size();i++){
			StringBuffer sb = new StringBuffer(l1.get(i));
			sb.reverse();
			if(l1.get(i).equals(sb.toString()))
				l2.add(sb.toString());
			
			
		}
	//	System.out.println(l2);
		System.out.println(l2.get(l2.size()-1));
		
	}

}
 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		
		System.out.println("Enter the String");
		
		String s1 = br.readLine();
		int length = s1.length();
		int start=0;
		for(int i=2;i<=length;i++){
			start = 0;
			int ss = i;
			int limit = length-(ss-1);
			for(int i1=0;i1<limit;i1++){
				String s2 = s1.substring(start , ss);
				start ++; ss++;
				System.out.println(s2);
				l1.add(s2);
				
			}
		}
		for(int i=0;i<l1.size();i++){
			StringBuffer sb = new StringBuffer(l1.get(i));
			sb.reverse();
			if(l1.get(i).equals(sb.toString()))
				l2.add(sb.toString());
			
			
		}
	//	System.out.println(l2);
		System.out.println(l2.get(l2.size()-1));
		
	}

}
