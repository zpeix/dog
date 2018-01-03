package shibushisha;

public class sha { 
	String name;
    String sex;
    int age;
public sha(){
	 System.out.println("大家好,我是一只单身狗");
}
public sha(String name){
	 this.name=name;
	 System.out.println("----------");
}
public sha(String name,int age){
	 this.name=name;
	  this.age=age;
	 System.out.println("---------");
}
public sha(String name,int age,String sex){
	 this.name=name;
	  this.age=age;
	  this.sex=sex;
	  
	 System.out.println("-----------");
}
public void show(){
	System.out.println(this.name+" "+this.age+" "+this.sex);
}


	
}




