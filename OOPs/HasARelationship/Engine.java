package HasARelationship;

//Has-A relationship is also know as composition or aggregation.

// There is no specific keyword to implement HAS-A relationship but mostly we can use new operator.

public class Engine {
// Engine specific functionality 
}

class Car {
	Engine e = new Engine();
//	class car HAS-A engine reference.
}