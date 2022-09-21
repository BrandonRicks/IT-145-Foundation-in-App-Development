## \`![Global Rain Logo ](media/a939e546fe260fd784b5edc3a6eed602.png)

**Developer**: Brandon Ricks

**Date**: 11/15/2019

# Summary Report Template

**Directions:** Place your pseudocode, flowchart, and explanation in the following sections. Before you submit your report, remove all bracketed [ ] text.

## Pseudocode

When you are done implementing the Pet class, refer back to the Pet BAG specification document and select either the pet check-in or check-out method. These methods are detailed in the Functionality section of the specification document.

Write pseudocode that lays out a plan for the method you chose, ensuring that you organize each step in a logical manner. Remember, you will not be creating the actual code for the method. You do **not** have to write pseudocode for both methods. Your pseudocode must not exceed one page.

| BEGIN CHECK if animal is dog or cat  IF cat  CHECK for available space  IF space available  INPUT cat  ELSE  NO available boarding  ELSE dog  CHECK for available space  IF space available  INPUT dog  ELSE  NO available boarding CHECK if animal is new or returning visitor  IF returning  UPDATE information  ELSE new  ADD information CHECK for grooming option  IF dog  IF staying more than or equal to 2 days  CHECK for grooming  IF yes  ADD grooming  ELSE no grooming  ELSE staying less than 2 days  NO grooming  ELSE no grooming ADD pet to available space END |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

## 

## Flowchart

Based on the pseudocode you wrote, create a flowchart using a tool of your choice for the method you selected. In your flowchart, be sure to include start and end points and appropriate decision branching, and align the flowchart to the check-in/check-out process. Your flowchart must be confined to one page.

| ![](media/7dc0860855bac1b45ce8e241f9d6a890.emf) |
|-------------------------------------------------|

## OOP Principles Explanation

Briefly explain how you applied object-oriented programming principles in the software development process. Your explanation should be one paragraph, or four to six sentences.

| In this programming, I applied a hierarchy, where I used conditional statements to allow the program to receive inputs and decide on the next appropriate path. Most conditional statements were regarding decisions, such as whether the animal was a cat or dog, and then using that information for future conditions and steps. In my class files, each of these classes have their own objects. I have my Cat.java file as a subclass of the parent file Pet.java. Pet handles the larger overarching portions of code, whereas the subclass handles specific statements in relation to Cat. In both files, most decision are handled using if/else statements, as most are a direct branch, rather than requiring a loop or other alternative. |
|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
