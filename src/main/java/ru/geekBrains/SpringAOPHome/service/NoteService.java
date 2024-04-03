package ru.geekBrains.SpringAOPHome.service;

import ru.geekBrains.SpringAOPHome.aspects.TrackUserAction;
import ru.geekBrains.SpringAOPHome.model.Note;

import java.util.List;

public interface NoteService {

    Note createNote(Note note);
    List<Note> getAllNotes();
    Note getNoteById(Long id);
    Note updateNote(Note note);
    void deleteNote(Long id);
}
