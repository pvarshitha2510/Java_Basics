package com.Operators;

public class Inc_dec {
	public static int num=10;

	public static void main(String[] args) {

        System.out.println("Original Value        : " + num);
        System.out.println("Pre-Increment (++num) : " + (++num));
        System.out.println("Value After Pre-Increment : " + num);

        System.out.println("Post-Increment (num++) : " + (num++));
        System.out.println("Value After Post-Increment : " + num);

        System.out.println("Pre-Decrement (--num) : " + (--num));
        System.out.println("Value After Pre-Decrement : " + num);

        System.out.println("Post-Decrement (num--) : " + (num--));
        System.out.println("Value After Post-Decrement : " + num);

	}

}
