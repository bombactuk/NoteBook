package edu.examples.java_classes.logic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.examples.java_classes.dao.NoteBookDao;
import edu.examples.java_classes.entity.Note;

public class NotebookLogic {

    private final NoteBookDao dao = new NoteBookDao();

    public void add(Note n) {
        dao.save(n);
    }

    public void add(String title, String content) {

        Note n = new Note(title, content);

        dao.save(n);

    }

    public void remove(Note n) {
        dao.delete(n);
    }

    public void sortTitle() {
        dao.sortTitle();
    }

    public void sortContent() {
        dao.sortContent();
    }

    public List<Note> find(String text) {

        List<Note> result = new ArrayList<>();

        List<Note> myNotes = dao.allNotes();

        for (Note n : myNotes) {
            if (isTextInNote(n, text)) {
                result.add(n);
            }
        }

        return result;

    }

    private boolean isTextInNote(Note n, String text) {
        return n.getTitle().contains(text) || n.getContent().contains(text);
    }


    public List<Note> find(Date date) {
        List<Note> result = new ArrayList<>();

        List<Note> myNotes = dao.allNotes();

        for (Note myNote : myNotes) {
            if (myNote.getD().equals(date)) {
                result.add(myNote);
            }
        }

        return result;

    }


    public List<Note> allNotes() {
        return dao.allNotes();
    }

}
