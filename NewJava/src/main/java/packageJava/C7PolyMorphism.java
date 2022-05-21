package packageJava;

/***
 * POLYMORPHISM
 * ************
 * Capability of the Method to act differently based on the object its acting upon
 * 
 * Types:
 * ******
 * 1) Static/Compile/Early binding(OverLoading)
 * 2) Dynamic/RunTime/Late Binding(Overriding)
 * 
 * OverLoading
 * ***********
 * 1)Method name Same
 * 2)Loading of method with different datatype or Order of passing parameters
 * 3)Happens at compile Time
 * 4)Done in Same Class
 * 
 * OverRiding
 * **********
 * 1)Method name same
 * 2)Over riding a method with different implementation in Child class
 * 3)No change in anything
 * 4)Happens at Runtime
 * 5)Done in Parent/Child Relationship
 * 
 * 
 * Difference between OverLoading & OverRiding
 * *******************************************
 * Aspect 					OverLoading								OverRiding
 *********					***********								**********
 * Name of Method			Must be Same							Must be Same
 * Argument Type			Must be diff(Or order should be diff)	Must be same(order also same)
 * Return Type				can be anything							Must be same(or) covariant return Type
 * Access Modifier			can be anything							It shud be equal or greater modifier
 * Throwing Exception 		No Restriction, can be anything			Parents should throw same / greater exception
 * Private Method			Can be Overloaded						Can't be Overridden(class method)
 * 
 * 
 * 
 * ****/

public class C7PolyMorphism {

}
