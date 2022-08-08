package Lab._01;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int numProjects = Integer.parseInt(scanner.nextLine());
        int hoursProjects = numProjects * 3;

        System.out.printf("The architect " + "%s" + " will need " + "%s" + " hours to complete " + "%d" + " project/s.",
                name, hoursProjects, numProjects);

    }
}
