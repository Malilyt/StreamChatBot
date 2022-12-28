package mesh.enums;

import java.util.*;

public enum Task {

    TASK_1("Давай похороночку!"),
    TASK_2("Го 6 часовой стрим!"),
    TASK_3("Скажи фразу дня"),
    TASK_4("Давай в");


    private static final List<String> VALUES;
    private String value;



    static {
        VALUES = new ArrayList<>();
        for (Task question : Task.values()){
            VALUES.add(question.value);
        }
    }

    Task(String value){
        this.value = value;
    }
    public static List<String> getValues(){
        return Collections.unmodifiableList(VALUES);
    }
}
