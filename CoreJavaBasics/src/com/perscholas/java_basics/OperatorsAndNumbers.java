package com.perscholas.java_basics;
/**
 * 
 */

/**
 * @author nbwoz
 *
 */
public class OperatorsAndNumbers {

	/**
	 * @param args
	 */
	
	public static void convertBinary(int num){
	     int binary[] = new int[40];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	}
	
	public static void main(String[] args) {
		// 1
		convertBinary(1);
		System.out.println();
		convertBinary(8);
		System.out.println();
		convertBinary(33);
		System.out.println();
		convertBinary(78);
		System.out.println();
		convertBinary(787);
		System.out.println();
		convertBinary(33987);
		System.out.println();
		
		// 2
		String binaryString="0010";  
		int decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);
		
		binaryString="1001";  
		decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);
		
		binaryString="00110100";  
		decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);
		
		binaryString="01110010";  
		decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);
		
		binaryString="001000011111";  
		decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);
		
		binaryString="0010110001100111";  
		decimal=Integer.parseInt(binaryString,2);  
		System.out.println(decimal);
		
		// 3
		int x = 2;
		String binaryX =Integer.toBinaryString(x);
		x = x << 1;
		// Decimal value = 1 Binary = 0001
		binaryX = Integer.toBinaryString(x);
		System.out.println(binaryX);
		decimal=Integer.parseInt(binaryX,2);  
		System.out.println(decimal);
		
		x = 9;
		x = x << 1;
		binaryX = Integer.toBinaryString(x);
		System.out.println(binaryX);
		decimal=Integer.parseInt(binaryX,2);  
		System.out.println(decimal);
		
		x = 17;
		x = x << 1;
		binaryX = Integer.toBinaryString(x);
		System.out.println(binaryX);
		decimal=Integer.parseInt(binaryX,2);  
		System.out.println(decimal);
		
		x = 88;
		x = x << 1;
		binaryX = Integer.toBinaryString(x);
		System.out.println(binaryX);
		decimal=Integer.parseInt(binaryX,2);  
		System.out.println(decimal);
		
		// 4
		x = 150;
		binaryX = Integer.toBinaryString(x);
		x = x >> 2;
		// Decimal = 200 binary = 0100
		System.out.println(x);
		binaryX = Integer.toBinaryString(x);
		System.out.println(binaryX);
		
		x = 225;
		binaryX = Integer.toBinaryString(x);
		x = x >> 2;
		System.out.println(x);
		binaryX = Integer.toBinaryString(x);
		System.out.println(binaryX);
		
		x = 1555;
		binaryX = Integer.toBinaryString(x);
		x = x >> 2;
		System.out.println(x);
		binaryX = Integer.toBinaryString(x);
		System.out.println(binaryX);
		
		x = 32456;
		binaryX = Integer.toBinaryString(x);
		x = x >> 2;
		System.out.println(x);
		binaryX = Integer.toBinaryString(x);
		System.out.println(binaryX);
		
		// 5
		x = 7;
		int y = 17;
		int z;
		// result = 1
		z = x & y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		
		// result = 23
		z = x|y;
		System.out.println(z);
		System.out.println(Integer.toBinaryString(z));
		System.out.println('\n');
		
		// 6
		x = 1;
		System.out.println(x);
		x++;
		System.out.println(x);
		
		// 7
		x = 1;
		System.out.println(x);
		x++;
		System.out.println(x);
		x += 1;
		System.out.println(x);
		x = x + 1;
		System.out.println(x);
		
		// 8
		x = 5;
		y = 8;
		int sum = ++x + y;
		System.out.println(sum);
		sum = x++ + y;
		System.out.println(sum);
	}

}
