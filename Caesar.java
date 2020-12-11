public class Caesar implements Cipher {
private int key;
public Caesar(int var1) {
this.key = var1;
}
public String encrypt(String var1) {
int var2 = this.key % 26;
if (var2 < 0) {
var2 += 26;
}
return this.rotate(var2, var1);
}
public String decrypt(String var1) {
int var2 = this.key * -1 % 26;
if (var2 < 0) {
var2 += 26;
}
return this.rotate(var2, var1);
}protected String rotate(int var1, String var2) {
String var3 = "";
for(int var4 = 0; var4 < var2.length(); ++var4) {
if (var2.charAt(var4) <= 'z' && var2.charAt(var4) >= 'a') {
var3 = var3 + (char)((var2.charAt(var4) - 97 + var1) % 26 + 97);
} else if (var2.charAt(var4) <= 'Z' && var2.charAt(var4) >= 'A') {
var3 = var3 + (char)((var2.charAt(var4) - 65 + var1) % 26 + 65);
} else {
var3 = var3 + var2.charAt(var4);
}
}
return var3;
}
public static void main(String[] var0)
 {
	int var1 = 4;
	String var2 = "";
	if (var0.length > 2) 
	{
		endEarly("Too many parameters!");
	}
	if (var0.length < 2) 
	{
		endEarly("Too few parameters!");
	}
	try 
	{
		var2 = var0[1];//plain text
		var1 = Integer.parseInt(var0[0]);//key
	} 
	catch (NumberFormatException var4) 
	{
		endEarly("Could not parse first parameter (n) as int");
	}
	Caesar var3 = new Caesar(var1);
	System.out.println(var3.encrypt(var2));
}//end of main()


private static void endEarly(String var0) 
{
	System.out.println(var0);
	System.out.println("Usage: java Brutus \"cipher text\"");
	System.exit(-1);
}
}
