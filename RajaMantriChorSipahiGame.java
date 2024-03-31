import java.util.Random;
import java.util.Scanner;

class RajaMantriChorSipahiGame {

  public static void main(String[] args) {
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);
    String[][] twoD_arr = new String[4][100];
    int[] totalScores = new int[4]; 

    System.out.println("************************************");
    System.out.println("*          Rules...!!              *");
    System.out.println("************************************");
    System.out.println("It is a simple game in which you have to guess the...");
    System.out.println("who is chor if you are sipahi...");
    System.out.println("If your are sipahi you will get 500 points...");
    System.out.println("If you are chor you will get 000 points...");
    System.out.println("If you are chor & you get caught you will get 5ex00 points...");
    System.out.println("If you are Mantri you will get 800 points...");
    System.out.println("If you are king you will get 1000 points...");
    
    System.out.println("\nPress 1 to start the game or any other key to exit.");
    int t = scanner.nextInt();

    if (t == 1) {      
    
    System.out.println("Enter Name of Player 1:- ");
    String p1 = scanner.nextLine();
    p1 = scanner.nextLine();
    System.out.println("Enter Name of Player 2:- ");
    String p2 = scanner.nextLine();
    System.out.println("Enter Name of Player 3:- ");
    String p3 = scanner.nextLine();
    System.out.println("Enter Name of Player 4:- ");
    String p4 = scanner.nextLine();
    System.out.println("Enter the no. of rounds you want to play");
    int n = scanner.nextInt();
  
    int round = 0;
    while(round < n){
      System.out.println("\nRound " + (round));
      System.out.println("***********************************************************");

    twoD_arr[0][0] = p1;
    twoD_arr[1][0] = p2;
    twoD_arr[2][0] = p3;
    twoD_arr[3][0] = p4;
  
    String[] C1 = { "Raja", "Mantri", "Chor", "Sipahi" };
    String[] C2 = { "Mantri", "Chor", "Sipahi", "Raja" };
    String[] C3 = { "Chor", "Sipahi", "Raja", "Mantri" };
    String[] C4 = { "Sipahi", "Raja", "Mantri", "Chor" };

    int rand_int = random.nextInt(1000);
    int rand = rand_int % 4;
    int i = 1;
    String Guess;
    switch (rand) {
      case 0:
        System.out.println(p1 + " is " + C1[0]);
        twoD_arr[0][i] = "1000";
        twoD_arr[1][i] = "800";
        System.out.println("Sipahi Sipahi Chor ko Pakro");
        System.out.println(p4 + " is " + C1[3]);
        System.out.print(p4 + " Enter Your Guess who is Chor:- ");
        Guess = scanner.next();
        if (Guess.equals(p3)) {
          System.out.println("You Are correct. " + p3 + " is "+C1[2]+" and "+ p2 + " is " +C1[1]);
          twoD_arr[2][i] = "000";
          twoD_arr[3][i] = "500";
        }
        else {
          System.out.println("You Are Worng. " + p3 + " is " + C1[2] + " and "+ p2 +  " is " +C1[1]);
          twoD_arr[2][i] = "500";
          twoD_arr[3][i] = "000";
        }
        i++;
        System.out.println("***********************************************************");
        break;


      case 1:
        System.out.println(p2 + " is " + C2[3]);
        twoD_arr[1][i] = "1000";
        twoD_arr[0][i] = "800";
        System.out.println("Sipahi Sipahi Chor ko Pakro");
        System.out.println(p3 + " is " + C2[2]);
        System.out.print(p3 + " Enter Your Guess who is Chor:- ");
        Guess = scanner.next();

        if (Guess.equals(p4)) {
          System.out.println("You Are correct. " + p4 + " is "+C2[1]+" and "+ p1 + " is " +C2[0]);
            twoD_arr[3][i] = "000";
            twoD_arr[2][i] = "500";
          } else {
          System.out.println("You Are Worng." + p4 + "Is The " + C2[1] + " and "+ p1 +  " " +C2[0]);

            twoD_arr[2][i] = "300";
            twoD_arr[3][i] = "500";
          }
        i++;
        System.out.println("***********************************************************");
        break;
        
      case 2:
        System.out.println(p3 + " is " + C3[2]);
        twoD_arr[2][i] = "1000";
        twoD_arr[3][i] = "800";
        System.out.println("Sipahi Sipahi Chor ko Pakro");
        System.out.println(p2 + " is " + C3[1]);
        System.out.print(p2 + " Enter Your Guess who is Chor :- ");
        Guess = scanner.next();

        if (Guess.equals(p1)) {
          System.out.println("You Are correct" + p1 + " is "+C3[0]+" and "+ p4 + " is " +C3[3]);
          twoD_arr[1][i] = "500";
          twoD_arr[0][i] = "000";
          } else {
          System.out.println("You Are Worng." + p1 + "Is The " + C1[2] + " and "+ p4 +  " " +C1[1]);
          twoD_arr[1][i] = "000";
          twoD_arr[0][i] = "500";
          }
        i++;
        System.out.println("***********************************************************");
        break;
      case 3:
        System.out.println(p4 + " is " + C4[1]);
        twoD_arr[3][i] = "1000";
        twoD_arr[2][i] = "800";
        System.out.println("Sipahi Sipahi Chor ko Pakro");
        System.out.println(p1 + " is " + C4[0]);
        System.out.print(p1 + " Enter Your Guess who is Chor :- ");
        Guess = scanner.next();

        if (Guess.equals(p2)) {
          System.out.println("You Are correct. " + p2 + " is "+C4[3]+" and "+ p3 + " is " +C4[2]);
          twoD_arr[1][i] = "000";
          twoD_arr[0][i] = "500";
          } else {
          System.out.println("You Are Worng. " + p2 + " is " + C4[3] + " and "+ p3 +  " is " +C4[2]);
          twoD_arr[1][i] = "500";
          twoD_arr[0][i] = "000";
          }
        i++;
        System.out.println("***********************************************************");
        break;
    }
    for(int j = 0; j< 4; j++){
        totalScores[j] += Integer.parseInt(twoD_arr[j][i-1]);
      }
    round++;
}
  for(int j = 0; j< 4; j++){
    System.out.println(twoD_arr[j][0] + "'s total score: " + totalScores[j]);
  }
  }
  else{
    System.exit(0);
  }
}
}