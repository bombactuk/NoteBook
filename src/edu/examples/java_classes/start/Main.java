package edu.examples.java_classes.start;

import java.util.Collections;
import java.util.List;

import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.logic.NotebookLogic;
import edu.examples.java_classes.output.NotebookOutput;

public class Main {

    public static void main(String[] args) {

        NotebookLogic logic = new NotebookLogic();

        logic.add("title5", "content5");
        logic.add("title3", "content2");
        logic.add("title1", "content5");

        logic.sortTitle();
        logic.sortContent();

        List<Note> myNotes = logic.allNotes();

        NotebookOutput output = new NotebookOutput();

        output.print("all notes", myNotes);

        logic.find("g");


    }

}
