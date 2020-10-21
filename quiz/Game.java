package com.quiz;

public class Game {
    Question[] questions=new Question[5];
    Player player=new Player();
    String[] questionsdata={"What type of galaxy is the most common in the universe?",
            "What is the coldest place in the universe?",
            "What is the largest planet in our solar system?",
            "What is the smallest planet in our solar system?",
            "What has a gravitational pull so strong that even light cannot escape it?"};
    String[] options1={"Spiral","crab nebula","Saturn","Venus","Black Hole"};
    String[] options2={"Elliptical","helix nebula","Earth","Pluto","Worm Hole"};
    String[] options3={"Irregular","eagle nebula","Jupiter","Mercury","White Hole"};
    String[] options4={"Regular","boomerang nebula","Mercury","Mars","Supernova"};
    int[] answers={2,4,3,3,1};
    public  void  initGame() {
        for (int i = 0; i < 5; i++) {
            questions[i] = new Question();
        }
        for (int i = 0; i < 5; i++) {
            questions[i].question = questionsdata[i];
            questions[i].option1 = options1[i];
            questions[i].option2 = options2[i];
            questions[i].option3 = options3[i];
            questions[i].option4 = options4[i];
            questions[i].correctAnswer = answers[i];
        }
    }
    public void play(){
        player.getDetails();
        for(int i=0;i<5;i++){
            boolean status=questions[i].askQuestion();
            if(status==true){
                System.out.println("Super Impressive,You are right!");
                player.score++;
            }
            else{
                System.out.println("Oops,I believe in you!");
            }
        }
        System.out.println(player.name+" your score is "+player.score+" / "+"5 ");
    }
}
