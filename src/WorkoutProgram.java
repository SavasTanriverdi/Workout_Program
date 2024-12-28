import java.util.Scanner;

// Main class to run the workout program
public class WorkoutProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Workout Program!");
        System.out.print("Enter the number of burpees: ");
        int burpees = scanner.nextInt();

        System.out.print("Enter the number of pushups: ");
        int pushups = scanner.nextInt();

        System.out.print("Enter the number of situps: ");
        int situps = scanner.nextInt();

        Workout workout = new Workout(burpees, pushups, situps);

        System.out.println("\nWorkout starts now! You can type 'burpee', 'pushup', or 'situp' to perform exercises.");
        while (!workout.isWorkoutComplete()) {
            System.out.print("\nEnter the exercise type: ");
            String exercise = scanner.next();

            System.out.print("Enter the number of repetitions: ");
            int count = scanner.nextInt();

            workout.performExercise(exercise, count);

            if (workout.isWorkoutComplete()) {
                System.out.println("\nCongratulations! You have completed your workout!");
            }
        }

        scanner.close();
    }
}