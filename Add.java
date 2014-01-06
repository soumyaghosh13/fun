class HelloWorld {
	static public void main(String[] args) {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHello([0]);
	}
	public void sayHello (String name){
		System.out.println("Hello"+name);
	}
}