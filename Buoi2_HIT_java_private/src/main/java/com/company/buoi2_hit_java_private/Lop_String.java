/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi2_hit_java_private;

/**
 *
 * @author 84393
 */
public class Lop_String {
//    int a=11;
//    String b="11";
//    //không nên dùng so sánh ==
    public static void main(String[] args) {
        
       // Khai báo và nối chuỗi
       String firstName = "John";
       String lastName = "Doe";
       String fullName = firstName + " " + lastName;
       String fullNameConcat = firstName.concat(" ").concat(lastName);

       // So sánh chuỗi
       String str1 = "Hello";
       String str2 = "World";
       String str3 = "Hello";
       boolean areEqual1 = str1.equals(str2); // Kết quả: false
       boolean areEqual2 = str1.equals(str3); // Kết quả: true
       boolean areEqualIgnoreCase = str1.equalsIgnoreCase("HELLO");
       // Kết quả: true
	// Lấy độ dài chuỗi
       String text = "Hello, world!";
       int length = text.length(); // Kết quả: 13

       // Trích xuất và tìm kiếm chuỗi con
       String sentence = "Java programming is fun and powerful.";
       String subString = sentence.substring(5, 15);
       // Kết quả: "programming"

       int indexOfFun = sentence.indexOf("fun"); // Kết quả: 21

       // Thay thế và chuyển đổi chuỗi
       String originalText = "I like apples and apples are tasty.";
	 String replacedText = originalText.replace("apples", "bananas");
	 String uppercaseText = originalText.toUpperCase();
	 String lowercaseText = originalText.toLowerCase();

	 // Kiểm tra chuỗi có chứa một ký tự/chuỗi con hay không
	 String message = "Hello, Java programming.";
	 boolean startsWithHello = message.startsWith("Hello");
	 // Kết quả: true

	 boolean endsWithProgramming = message.endsWith("programming.");
	 // Kết quả: false

	 boolean containsJava = message.contains("Java");
	 // Kết quả: true

    }
}
