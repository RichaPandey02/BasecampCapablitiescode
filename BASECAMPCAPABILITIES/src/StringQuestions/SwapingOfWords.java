/*1)-"first taking a string from user"
 * 2-) And pass the string in validateString() method to check weather a string is valid or not.
 * 3-) After that pass this resultant string into storingWord() method.
 * 4-)In storing string method basically split this string
 * 5-)After this pass this result to duplicateWords() method.
 * 5.a)-In duplicateWords() method first check the non duplicate in first word.
 * 5.b)-second check the non duplicate in second word.
 * 6)-return the resultant string in storingWord.
 * 7)-return result in main method and print it.
 * 
 * 
 * 
 * */
package StringQuestions;

import java.util.Scanner;

public class SwapingOfWords {

private static String storingWord(String s) {
int c = 0, a = 0;
//counting spaces for the words.....
for (int i=0;i <s.length();i++) {
if (s.charAt(i) == ' ')
c++;
}
String[] word = new String[c + 1];
String s1 = "";
for (int i=0;i<s.length();i++) {
if (s.charAt(i) != ' ') {
s1 += s.charAt(i);
word[a] = s1;
} else {
a++;
s1 = "";      //basically we are splitting here...
}
}
String result = duplicateWords(word);   //passing the result in duplicateWords() function.
return result;
}

private static String duplicateWords(String[] word) {
String res1 = "";
String res2 = "";
String s1 = word[0];
String s2 = word[1];
for (int i=0; i<s1.length();i++) { //selecting non duplicate in first word.......
int c = 0;
for (int j=0;j<s2.length();j++) {
if (i != j && s1.charAt(i) == s2.charAt(j)) {
c = 1;
break;
}
}
if (c == 0 && s1.charAt(i) != ' ')
res1 += s1.charAt(i);
}
for (int i=0; i<s2.length();i++) {   //selecting non dublicate in second word..
int c = 0;
for (int j=0; j<s1.length();j++) {
if (i!=j &&s2.charAt(i)==s1.charAt(j)) {
c = 1;
break;
}
}
if (c==0 &&s2.charAt(i) != ' ')
res2 += s2.charAt(i);
}
String result = res2 + ' ' + res1; 
return result;
}

public String validateString(String str) {
int count = 0;
for (int i = 0; i< str.length();i++) {
if (str.charAt(i)== ' ')
count++;
}
if (count > 1) {
System.out.println("WRONG SENTENSE PLESE RETRY....");

}
return str;
}

public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string..");
String str = sc.nextLine();
SwapingOfWords obj = new SwapingOfWords();
String str1 = obj.validateString(str);
String res = obj.storingWord(str1);
System.out.println(res);
}

}

