package mesh.enums;

import java.util.*;
import java.util.stream.Stream;

public enum Question {

    QUESTION_1("Как дела?"),
    QUESTION_2("Весело тебе?"),
    QUESTION_3("Когда заканчивать планируешь?"),
    QUESTION_4("Как игра?"),
    QUESTION_5("Когда жара?"),
    QUESTION_6("Когда новый видос?"),
    QUESTION_7("На улице был сегодня?"),
    QUESTION_8("Я всё пропустил?"),
    QUESTION_9("Что я пропустил?"),
    QUESTION_10("Что сегодня пьёшь?"),
    QUESTION_11("Может алкострим?");


   private static final List<String> VALUES;
   private String value;



    static {
        VALUES = new ArrayList<>();
        for (Question question : Question.values()){
            VALUES.add(question.value);
        }
    }

    Question(String value){
        this.value = value;
    }
    public static List<String> getValues(){
        return Collections.unmodifiableList(VALUES);
    }





}
