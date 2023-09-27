import java.util.Scanner;
class Animal
{
	int age,height;
	String  breed,colour;
	public Animal(int age,int height,String breed,String colour)
	{
       this.age=age;
       this.height=height;
       this.breed=breed;
       this.colour=colour;
	}
	public void display()
	{
       System.out.println("Age\t\t:\t"+this.age);
       System.out.println("Height\t\t:\t"+this.height); 
       System.out.println("breed\t\t:\t"+this.breed);
       System.out.println("Colour\t\t:\t"+this.colour);
	}
  
}
class Dog extends Animal
{
	String dog_name,dog_sound;
    public Dog(int age,int height,String breed,String colour,String dog_name,String dog_sound)
	{
        super(age,height,breed,colour);
		this.dog_name=dog_name;
		this.dog_sound=dog_sound;
    }
    public void display()
    {
		System.out.println("Dog Name\t:\t"+this.dog_name);
		System.out.println("Dog sound\t:\t"+this.dog_sound);
    }
}
class Cat extends Animal
{
    String cat_name,cat_sound;
    public Cat(int age,int height,String breed,String colour,String cat_name,String cat_sound)
    {    
        super(age,height,breed,colour);
        this.cat_name=cat_name;
        this.cat_sound=cat_sound;
    }
}
class Test
{
    public static void main(String args[])
    {
        Animal ref;
        Animal ob1=new Animal(6,3,"rtrt","black");
        Dog ob2=new Dog(10,5,"labra","black","anky","Bhow Bhow");
        Cat ob3=new Cat(5,4,"parseon","white","cutie","Meow Meow");
		ref=ob1;
		ob1.display();
		ref=ob2;
		ob2.display();
		ref=ob3;
		ob3.display();
		
    }
}