# Workout_Program

This project is a console-based workout program application. It allows users to input their exercise goals and track their progress while performing exercises like burpees, pushups, and situps.

---

## Features
- Allows users to set workout goals for burpees, pushups, and situps.
- Tracks the remaining number of repetitions for each exercise.
- Provides feedback on whether the input repetitions are valid or exceed the goal.
- Notifies users when they complete their workout.

---

## Code Overview

### 1. `Workout` Class
- **Attributes**:
  - `burpeeCount`: Total number of burpees to complete.
  - `pushupCount`: Total number of pushups to complete.
  - `situpCount`: Total number of situps to complete.
- **Methods**:
  - `performExercise(String exerciseType, int count)`: Reduces the count of the specified exercise and provides feedback.
  - `isWorkoutComplete()`: Checks if all exercises are completed.

### 2. `WorkoutProgram` Class
- Contains the `main` method, which:
  - Prompts the user to enter exercise goals.
  - Continuously accepts exercise type and count from the user.
  - Tracks progress and notifies when the workout is completed.

---

## How to Run

1. Clone the repository or download the project files.
2. Open the project in an IDE such as **IntelliJ IDEA** or **Eclipse**.
3. Compile and run the `WorkoutProgram.java` file.

---

## Sample Output

```plaintext
Welcome to the Workout Program!
Enter the number of burpees: 10
Enter the number of pushups: 20
Enter the number of situps: 15

Workout starts now! You can type 'burpee', 'pushup', or 'situp' to perform exercises.

Enter the exercise type: burpee
Enter the number of repetitions: 5
You completed 5 burpees. Remaining: 5

Enter the exercise type: pushup
Enter the number of repetitions: 10
You completed 10 pushups. Remaining: 10

Enter the exercise type: situp
Enter the number of repetitions: 15
You completed 15 situps. Remaining: 0

Enter the exercise type: burpee
Enter the number of repetitions: 5
You completed 5 burpees. Remaining: 0

Enter the exercise type: pushup
Enter the number of repetitions: 10
You completed 10 pushups. Remaining: 0

Congratulations! You have completed your workout!
