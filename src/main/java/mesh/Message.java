package mesh;

import mesh.enums.*;

import java.util.ArrayList;
import java.util.List;

public class Message{

    Bool bool = new Bool();
    Written written = new Written();
    int cycleRandom;
    RandomHelper rN = new RandomHelper();

    List<String> questionList =Question.getValues();
    ArrayList<String> questionArrayList = new ArrayList<>(questionList);

    List<String> taskList = Task.getValues();
    ArrayList<String> taskArrayList = new ArrayList<>(taskList);


    private String mes = "";

    public void cycleMessage(){
        if(taskArrayList.size() > 1 && questionArrayList.size() > 1 ) {
            cycleRandom = rN.randomNumbers(1, 2);

            if (cycleRandom == 1) {
                // Task
                task();
            }

            if (cycleRandom == 2) {
                // Question
                question();
            }
        }else if (taskArrayList.size() == 1 && questionArrayList.size() > 1 ) {
            // Question
            question();
        }else if (taskArrayList.size() > 1 && questionArrayList.size() == 1 ) {
            // Task
            task();
        }else cycleMessage();

        // Hello
        hello();

    }

    public String mes(){
        cycleMessage();
        return mes;
    }

    public void question() {

        mes = listOut(questionArrayList);

        switch (mes){
            case "Я всё пропустил?":
                questionArrayList.remove("Что я пропустил?");
                mes += happySmile();
                break;

            case "Что я пропустил?":
                questionArrayList.remove("Я всё пропустил?");
                mes += happySmile();
                break;

            default:
                mes += happySmile();
                break;
        }
    }

    public void hello(){

        if(bool.helloBool == 0) {
            written.writtenArray.clear();

            Hello hello = Hello.randomHello();
            happySmile();
            mes = hello.getOut() + " " + happySmile();
            bool.helloBoolTrue();
        }
    }

    public void task() {

        Game game = Game.randomGame();
        mes = listOut(taskArrayList);

        switch (mes) {
            case "Давай в":
                String gameOut = game.getOut();
                mes += gameOut + happySmile();
                break;
            default:
                mes += happySmile();
                break;
        }
    }

    public String happySmile() {

        HappySmile happySmile = HappySmile.randomHappySmile();
        return happySmile.getOut();
    }

//    public void checkConstant(String mes){
//        written.constantWritten(mes);
//
//        if(written.constantMes == true){
//            cycleMessage();
//        }
//        if(written.constantMes == false){
//            written.addWritText(mes);
//        }
//    }
//
//    public void addConstant(String mes){
//            written.addWritText(mes);
//
//    }

    public String listOut(List list){
        String out = rN.randomList(list);
        list.remove(out);
        return out;
    }


}


