package chap01_DataType;

public class Ex05_TypeCasting_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float value1 = 3;			//int -> float(업캐스팅)
		long value2 = 5;			//int -> long(업캐스팅)
		double value3 = 7;			//int -> double(업캐스팅)
		byte value4 = 9;			//(예외 : int -> byte)
		short value5 = 11;			//(예외 : int -> short)
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println(value5);
		System.out.println();

		
		byte value6 = (byte)128;	//int -> byte (다운캐스팅) = 1byte = 1bit = 0~127까지만 표현하므로 초과분은 -128부터시작
		int value7 = (int)3.5;		//double -> int (다운캐스팅)
		float value8 = (float)7.5;	//doube -> float (다운캐스팅)
		
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
	}

}
