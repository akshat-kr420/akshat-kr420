public class Q2{
public static void main(String[] args){
String s="Take u forward is Awesome";

char[] ch=s.toCharArray();
int v=0,c=0,d=0;
for(int i=0;i<s.length();i++){
if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
{
v++;
}

else if(ch[i]==' ')
{
c++;
}
else
{
d++;
}
}
System.out.println("Vowels::"+v);
System.out.println("Space::"+c);
System.out.println("Consonant::"+d);

}
}
