class Room{
int length;
int breath;
Room()
{
length=-123;
breath=2;
}
Room(int length,int breath)
{
this();
this.length=length;
this.breath=length;
this.PrintValue();	
}

public void PrintValue()
{
System.out.println("length and breath after area is "+(length*breath));
}
}