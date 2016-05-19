package com.momai.enumtest;

/**
 * @author 	Administrator
 * @date	2015年12月16日 下午8:00:31
 * @desc	
 */
public class EnumTest {
	Day day;

	/**
	 * @param day
	 */
	public EnumTest(Day day) {
		super();
		this.day = day;
	}

	public void tellLikeItIs() {
		switch (day) {
		case MONDAY:
			System.out.println("Monday is bad.");
			break;
		case FRIDAY:
			System.out.println("Friday is better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Mideweek days are so-so.");
		}
	}

	public static void main(String[] args) {
		System.out.println(Day.MONDAY);
		EnumTest firstDay = new EnumTest(Day.MONDAY);
		firstDay.tellLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WENSDAY);
		thirdDay.tellLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellLikeItIs();
		EnumTest sventhDay = new EnumTest(Day.SUNDAY);
		sventhDay.tellLikeItIs();
	}
}
