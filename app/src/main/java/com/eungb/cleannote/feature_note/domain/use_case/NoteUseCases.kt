package com.eungb.cleannote.feature_note.domain.use_case

// ViewModel 에 주입할 객체
data class NoteUseCases(
    val getNotes: GetNotes,
    val deleteNote: DeleteNote,
    val addNote: AddNote,
    val getNote: GetNote
)