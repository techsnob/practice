package com.techsnob.practice;

class InnerClasses {
	
	public static class Mini{
		private static int a = 0;
		public int b = 21;
	}

	public static void main(String[] args) {
		InnerClasses.Mini m = new InnerClasses.Mini();
		System.out.println(m.a+m.b);
	}

}
