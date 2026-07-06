import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. What is the result of 10 + 20?",
            "4. Which keyword is used to inherit a class in Java?",
            "5. Who is known as the father of Java?"
        };

        // Options
        String[][] options = {
            {"A. Mumbai", "B. New Delhi", "C. Chennai", "D. Kolkata"},
            {"A. Python", "B. Java", "C. C++", "D. PHP"},
            {"A. 20", "B. 25", "C. 30", "D. 40"},
            {"A. implements", "B. extends", "C. import", "D. package"},
            {"A. James Gosling", "B. Dennis Ritchie", "C. Bjarne Stroustrup", "D. Guido van Rossum"}
        };

        // Correct answers
        char[] answers = {'B', 'B', 'C', 'B', 'A'};

        int score = 0;

        System.out.println("===== JAVA QUIZ APPLICATION =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer is " + answers[i]);
            }
        }

        System.out.println("\n===== QUIZ COMPLETED =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        double percentage = (score * 100.0) / questions.length;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80)
            System.out.println("Grade: Excellent");
        else if (percentage >= 60)
            System.out.println("Grade: Good");
        else if (percentage >= 40)
            System.out.println("Grade: Average");
        else
            System.out.println("Grade: Needs Improvement");

        sc.close();
    }
}