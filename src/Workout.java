import java.util.Scanner;

// Class representing a workout program
class Workout {
    private int burpeeCount;
    private int pushupCount;
    private int situpCount;

    // Constructor
    public Workout(int burpeeCount, int pushupCount, int situpCount) {
        this.burpeeCount = burpeeCount;
        this.pushupCount = pushupCount;
        this.situpCount = situpCount;
    }

    // Method to perform an exercise
    public void performExercise(String exerciseType, int count) {
        switch (exerciseType.toLowerCase()) {
            case "burpee":
                if (count <= burpeeCount) {
                    burpeeCount -= count;
                    System.out.println("You completed " + count + " burpees. Remaining: " + burpeeCount);
                } else {
                    System.out.println("You don't have enough burpees left to complete.");
                }
                break;
            case "pushup":
                if (count <= pushupCount) {
                    pushupCount -= count;
                    System.out.println("You completed " + count + " pushups. Remaining: " + pushupCount);
                } else {
                    System.out.println("You don't have enough pushups left to complete.");
                }
                break;
            case "situp":
                if (count <= situpCount) {
                    situpCount -= count;
                    System.out.println("You completed " + count + " situps. Remaining: " + situpCount);
                } else {
                    System.out.println("You don't have enough situps left to complete.");
                }
                break;
            default:
                System.out.println("Invalid exercise type.");
        }
    }

    // Method to check if the workout is complete
    public boolean isWorkoutComplete() {
        return burpeeCount == 0 && pushupCount == 0 && situpCount == 0;
    }
}