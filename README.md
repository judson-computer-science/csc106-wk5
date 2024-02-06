# Week 5

## Exercise 1
- Step 1:  create a new application class with a non-static method and attempt to invoke it from `main()`
  - what do you notice when you try to compile it?
  - now make the method static and try again
- Step 2:  create an instance variable (one that is non-static) and attempt to access it from within the static method
  - what do you notice when you try to complie it?
  - now instantiate a new object of the application class and try again

## Exercise 2
Implement a gymnastics scoring program with the following classes:

- `ScoreTracker` class (the application class):
  - Must implement a method called `getScore()` that prompts the user for a valid score until a valid (in range) score is provided.
  - `getScore()` should validate based on `MIN_SCORE` and `MAX_SCORE` provided by the `Score` class
- `Score` class:
  - Must provide public static members `MIN_SCORE` and `MAX_SCORE`
- `ScoreFormatter` class:
  - Must use a compound condition to print the following message if the highest score is over 9.8 and the lowest score is at least 9.5:

~~~~~
“Congratulations, you are a top performer!”
~~~~~
