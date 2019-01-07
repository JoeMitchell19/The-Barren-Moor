import java.util.Scanner;
public class Game{
    public static void main(String[]args){
        Game test = new Game();
        test.actone();
        test.acttwo();
        test.actthree();
        test.actfour();
        test.actfive();
        test.actsix();
    }
    //This section of code contains the main method as well as highlighting all the methods used in the game.
public void actone(){
    System.out.println("You awaken on a gloomy moor. The murky clouds hug the moor as you lift yourself up from the thick moorland grass.");
    System.out.println("You feel something heavy in the pocket of your coat. Removing the item from your pocket reveals what appears to be a mobile device.");
    System.out.println("You inspect the device and the screen says");
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = s.nextLine();
    System.out.println("Hello "+name);}
//In act one, the scene is set using text outputs. The user inputs their name using the scanner and it is read by the application.
    public void acttwo(){
    System.out.println("Please enter your password");
    System.out.println("You do not know the password as you have no idea how you acquired the device!");
    System.out.println("You realise that looking around your current location may help you");
    System.out.println("You note that you can only look Up or Down, and either Left or Right");
    System.out.println("Please choose the first direction to look");
    Scanner s = new Scanner(System.in);
    String direction1 = s.nextLine();
    System.out.println("Please choose the second direction to look");
    String direction2 = s.nextLine();
    if(direction1.equals("Down") && direction2.equals("Left")||direction1.equals("Left") && direction2.equals("Down")){
        System.out.println("You find a piece of paper with writing on it and you begin to inspect it closely");
    }
    else if(direction1.equals("Down") && direction2.equals("Right")||direction1.equals("Right") && direction2.equals("Down")){
        System.out.println("You notice an S shaped rock and you continue to investigate your surroundings");
    }
    else if(direction1.equals("Up")||direction2.equals("Up")){
        System.out.println("You see the grey clouds lingering above you; There isn't much to see up here!");
    }
    else{
        System.out.println("Invalid command please try again");
    }
}
// In act two, the first task is to try and find the piece of paper with writing on it using the scanner and if/else statements. A Boolean and while loop would be added to allow the user to enter the correct commands.
// The boolean and while statement proved to be difficult to add in the timeframe of the project, although with additional time and assistance I'd hope to implement them throughout the code.
// The correct answer would allow the player to continue through the game, whilst incorrect answers would return the user to the start of the "Enter directions stage".
// I had hoped to use the player's name throughout the game which proved to be difficult. 
public void actthree(){
    System.out.println("Inspecting the piece of paper you read the following");
    System.out.println("4 DIGIT PASSWORD");
    System.out.println("35+61, 9 x 8");
    System.out.println("Please enter the password into the device.");
    Scanner s = new Scanner(System.in);
    int password = s.nextInt();
    int correctpassword = 9672;
    if(password == correctpassword){
        System.out.println("You hear a voice coming through the phone's speakers.");
        System.out.println("Well done for unlocking me, it says. I am the Seshbot, and we're gonna play a game!");
    }
    else{
        System.out.println("Incorrect password. Please try again");
    }
    }
// In act three, the user enters the password using the information found out in act two. Once again, A boolean and while loop would be added to allow the user to retry entering the password (SEE LINE 46).
// The correct answer would allow the player to continue through the game, whilst incorrect answers would return the user to the start of the "Enter password stage".
public void actfour(){
    System.out.println("The game is simple, The Seshbot explains.");
    System.out.println("You notice that the screen is now designed similarly to a compass.");
    System.out.println("You get to make 3 simple choices - 3 directions is all I ask of you");
    System.out.println("Choose between: North, South, East and West");
    System.out.println("For each direction you choose, I will take you 5 miles in that direction");
    System.out.println("Get these choices right and I will safely lead you to a good place that is 15 miles away.");
    System.out.println("But get them wrong, and we aren't going to get there!");
    System.out.println("So, What's it gonna be?");
    System.out.println("Please choose the first direction");
    Scanner s = new Scanner(System.in);
    String direction1 = s.nextLine();
    System.out.println("Please choose the second direction");
    String direction2 = s.nextLine();
    System.out.println("Please choose the third direction");
    String direction3 = s.nextLine();
    if (direction1.equals("North") && direction2.equals("North") && direction3.equals("West")||direction1.equals("North") && direction2.equals("West") && direction3.equals("North")||direction1.equals("West") && direction2.equals("North") && direction3.equals("North")){
        System.out.println("Well done! We made it safely to the good place!");
    }
    else{
        System.out.println("Oh no! We're nowhere near the good place. We're lost! We'd better go back and try again.");
    }
}
// In act four, the directions are chosen by the user's inputs. Similar to before, a boolean and while loop would be added to allow repeat attempts to be performed (SEE LINE 46).
// Note that I only realised that the distance from the desired location was required late in the day and hence if I had more time I would amend the direction section to include this.
// An additional amendment that could be made is to remove the case sensitivity of the user inputs, which I didn't know how to implement. 
public void actfive(){
    System.out.println("You are irritated. What is so good about THIS place? You wonder. It's just the same barren moor that I've been on since I woke up!");
    System.out.println("The Seshbot spoke once again");
    System.out.println("Thank you,you have reunited me with my partner device - the coolbox");
    System.out.println("Now you must open my partner device to destroy the demons inside the coolbox's soul");
    System.out.println("The coolbox is on the ground. The opening is locked with a sophisticated digital locking mechanism with an attached pinpad and display.");
    System.out.println("The instructions appeared on locking mechanism display.");
    System.out.println("Remember the following numbers and then answer 4 questions correctly to unlock, it read.");
    Scanner s = new Scanner(System.in);
    System.out.println("Are you ready?");
    String response = s.nextLine();
    if(response.equals("Yes")){
        System.out.println("Good. Then we'll begin.");
    }
    else{
        System.out.println("You are not ready and therefore are not worthy.");
        return;
    }
    int gameArray[];
    gameArray = new int[15];
    gameArray[0] = 8;
    gameArray[1] = 12;
    gameArray[2] = 18;
    gameArray[3] = 8;
    gameArray[4] = 6;
    gameArray[5] = 2;
    gameArray[6] = 20;
    gameArray[7] = 5;
    gameArray[8] = 10;
    gameArray[9] = 4;
    gameArray[10] = 7;
    gameArray[11] = 13;
    gameArray[12] = 8;
    gameArray[13] = 1;
    gameArray[14] = 9;
    for(int a =0;a <gameArray.length;a++){
        System.out.println(gameArray[a]);
    }
    System.out.println("Question 1. What is the first number you saw multiplied by the sixth number you saw?");
    int answer1 = s.nextInt();
    int correctanswer1 = 16;
    if (answer1 == correctanswer1){
        System.out.println("Correct");
    }
    else{
        System.out.println("Incorrect");
    }
    System.out.println("Question 2. What is the eleventh number you saw minus the second number you saw?");
    int answer2 = s.nextInt();
    int correctanswer2 = 1;
    if(answer2 == correctanswer2){
        System.out.println("Correct");
    }
    else{
        System.out.println("Incorrect");
    }
    System.out.println("Question 3. What is the fifth number you saw added to the third number you saw?");
    int answer3 = s.nextInt();
    int correctanswer3 = 24;
    if(answer3 == correctanswer3){
        System.out.println("Correct");
    }
    else{
        System.out.println("Incorrect");
    }
    System.out.println("Question 4. What is the total sum of all the numbers you saw?");
    int answer4 = s.nextInt();
    int correctanswer4 = 131;
    if(answer4 == correctanswer4){
        System.out.println("Correct");
    }
    else{
        System.out.println("Incorrect");
    }
}
// Act five is the longest. It contains the final gameplay elements of the game. Similar to before, a boolean and while loop would be utilised to allow repeat attempts at questions that weren't answered correctly.
// Once all the questions are answered correctly, the final method would be run.
// Note that in this method I have created an array and used a for loop to print the array also.
public void actsix(){
    System.out.println("The lock on the coolbox opens. A fantastic bright light escapes from the coolbox.You cover your eyes to prevent yourself being blinded.");
    System.out.println("As the light hit the sky, the clouds began to part, revealing blue sky and sunshine that had previously been hidden");
    System.out.println("The Seshbot shrieked as the demons emerged.");
    System.out.println("You catch a glimpse of the demons.");
    System.out.println("The demons are 12 cans of Stella Artois.");
    Scanner s = new Scanner(System.in);
    System.out.println("The Seshbot and Coolbox asked in unison - Can you take care of these demons? Yes or No?");
    String response = s.nextLine();
    if(response.equals("Yes")){
        System.out.println("You open a can of Stella and take a mighty swig. The taste of victory had never been sweeter.");
        System.out.println("Congratulations, You won!");
    }
    else if(response.equals("No")){
        System.out.println("No because I don't drink alcohol. However, I can take them off your hands for you. I'm sure someone will be very grateful for these!");
        System.out.println("Congratulations, You won!");
    }
    else{
        System.out.println("Really?! You mess up here?! You'll have to play again!");
    }
}
// The final act has one fun user input that leads to the ending (or not!). Note that removing case sensitivity here is crucial as it implies a different ending if 1 letter is a capital letter.
}