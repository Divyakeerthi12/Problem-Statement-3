# Problem-Statement-3
Problem Statement: Mr. Sharma owns a bakery shop and is quite popular for baking
variety of cakes and pastries. Each day he comes up with Today’s Special Menu that
includes two special cakes and two special pastries. He prepares Today’s Special
Menu every day and puts it for the display. But with every passing day, it has become
painful for Mr. Sharma to prepare the hand written menu.
Let’s help Mr. Sharma by writing a small Java program that prints the menu in this
format.
 Today's Special Menu
 --------------------------------------------------
 Special Cakes
 ---------------------------------------------
 Chocolate Brownie : ₹ 250.0 per pound
 Chocolate Maple : ₹ 300.0 per pound
 Special Pastries
 ---------------------------------------------
 Black Forest : ₹ 35.0 per piece
 Choco Truffle : ₹ 40.0 per piece
Use For Each loop to
print all cakes
Use For Each loop to
print all pastries
Approach: Follow the steps and complete the assignment
1. Let us consider Cake and Pastry. Both of these can be drafted as a separate model
classes. So lets create an empty class of Cake and Pastry.
• Firstly, within your project package create a class Cake.
• Secondly within your project package create another class Pastry.

 Hint: To create a new class, right click on your package, go to New —> Java File and
enter your class name as Cake and Pastry one by one. Your project should look like this:

2. Next, we need to define properties of Cake and Pastry. Firstly what are the similarities
between these two? Well, a pastry is also a kind of Cake. So we can apply the concept of
inheritance.
• Make class Pastry extend properties of class Cake. So Cake becomes super class and
pastry becomes sub class or child class.
3. Now within class Cake define following properties as instance variables.
• Define name as String. [ A cake should have a name ]
• Define price as float. [ A cake should have a price ]
4. Define Getter and Setter within class Cake.
• To create Getter and Setter you can either write all methods manually or auto-generate
it as we did in the topic of Getter and Setter.
5. Define a display() method within class Cake that contains a print statement to print the
cake details in the following format:
 Chocolate Brownie : Ũ 250.0 per pound
6. Now, what about the code of class Pastry. Since, class Pastry inherits from class Cake so it
automatically gets all the instance variable as well as getters and setters methods. But
still we need to write some code within class Pastry
• Let’s override display() method from super class and modify the print statement to get
the output in this format:
 Black Forest : Ũ 35.0 per piece
• So class Pastry only contains overridden display() method.
Cake name Cake price
7. Now that the code within class Pastry and class Cake is complete. Let’s come to our class
Main. Within main() method -
• Define an ArrayList that will contain objects of class Cake.
• Create the objects of Cake with following properties and add both of them to the
ArrayList
1. “Chocolate Brownie”, Ũ 250.0
2. “Chocolate Maple”, Ũ 300.0
• Define another ArrayList that will contain objects of class Pastry
• Create the objects of Pastry with following properties and add both of them to the
ArrayList
1. “Black Forest”, Ũ 35.0
2. “Choco Truffle”, Ũ 40.0
8. Once your both the lists are prepared, write a print statement that will print the following:

 Today's Special Menu
 --------------------------------------------------
9. Next, write print statements to print the following:

 Special Cakes
 ---------------------------------------------
10. It’s time to use for each loop and iterate through ArrayList of Cake. With each iteration call
the display() method. So this will print the following:

 Chocolate Brownie : Ũ 250.0 per pound
 Chocolate Maple : Ũ 300.0 per pound
11. Finally, let’s write print statements for Pastries. Follow step number 9 and 10 for the same.
Henceforth, you will get this output:
 Special Pastries
 ---------------------------------------------
 Black Forest : ₹ 35.0 per piece
 Choco Truffle : ₹ 40.0 per piece

12. Lastly, run your code, verify the output and submit the project.
