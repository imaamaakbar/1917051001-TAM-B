package com.wajihan.mynotesapp;

import com.wajihan.mynotesapp.entiity.Note;

import java.util.ArrayList;

public interface LoadNotesCallback {
    void preExecute();

    void postExecute(ArrayList<Note> notes);
}
