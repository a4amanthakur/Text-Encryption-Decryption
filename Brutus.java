public class Brutus implements Cipher {
double[] english = new double[]{0.0855D, 0.016D, 0.0316D, 0.0387D, 0.121D, 0.0218D, 0.0209D, 0.0496D, 0.0733D, 0.0022D, 0.0081D, 0.0421D, 0.0253D, 0.0717D, 0.0747D, 0.0207D, 0.001D, 0.0633D, 0.0673D, 0.0894D, 0.0268D, 0.0106D, 0.0183D, 0.0019D, 0.0172D, 0.0011D};
public String encrypt(String var1) {
return var1;
}
public String decrypt(String var1) {int var2 = -1;
double var3 = Double.MAX_VALUE;
for(int var5 = 0; var5 < 26; ++var5) {
double var6 = this.chiSquared(this.computeFrequencies(this.rotate(var5, var1)), this.english);
if (var6 < var3) {
var2 = var5;
var3 = var6;
}
}
return this.rotate(var2, var1);
}
private double[] computeFrequencies(String var1) {
double[] var2 = new double[26];
int var3 = 0;
int var4;
for(var4 = 0; var4 < var1.length(); ++var4) {
if (var1.charAt(var4) <= 'z' && var1.charAt(var4) >= 'a') {
++var2[var1.charAt(var4) - 97];
++var3;
} else if (var1.charAt(var4) <= 'Z' && var1.charAt(var4) >= 'A') {
++var2[var1.charAt(var4) - 65];
++var3;
}
}for(var4 = 0; var4 < 26; ++var4) {
var2[var4] /= (double)var3;
}
return var2;
}
private double chiSquared(double[] var1, double[] var2) {
double var3 = 0.0D;
for(int var5 = 0; var5 < 26; ++var5) {
var3 += (var1[var5] - var2[var5]) * (var1[var5] - var2[var5]) / var2[var5];
}
return var3;
}
protected String rotate(int var1, String var2) {
String var3 = "";
for(int var4 = 0; var4 < var2.length(); ++var4) {
if (var2.charAt(var4) <= 'z' && var2.charAt(var4) >= 'a') {
var3 = var3 + (char)((var2.charAt(var4) - 97 + var1) % 26 + 97);
} else if (var2.charAt(var4) <= 'Z' && var2.charAt(var4) >= 'A') {
var3 = var3 + (char)((var2.charAt(var4) - 65 + var1) % 26 + 65);
} else {
var3 = var3 + var2.charAt(var4);}
}
return var3;
}
public static void main(String[] var0) 
{
	if (var0.length > 1) 
	{
		endEarly("Too many parameters!");
	}
	if (var0.length < 1) 
	{
		endEarly("Too few parameters!");
	}
	String var1 = var0[0];
	Brutus var2 = new Brutus();
	System.out.println(var2.decrypt(var1));
}//end of main function

private static void endEarly(String var0) 
{
	System.out.println(var0);
	System.out.println("Usage: java Brutus \"cipher text\"");
	System.exit(-1);
}
}//end of class
