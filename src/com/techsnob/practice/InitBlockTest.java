package com.techsnob.practice;

public class InitBlockTest {

	int i = 1;
	{
		i = 2;
	}
	InitBlockTest (){
		i = 3;
	}
	InitBlockTest(int i){
		this.i = i;
	}
	{
		i=4;
	}
	public void print() {
		System.out.print(i);
	}
	public static void main(String[] args) {
		new InitBlockTest().print();
		new InitBlockTest(5).print();
	}

}
