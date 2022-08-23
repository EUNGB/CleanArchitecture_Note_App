package com.eungb.cleannote.feature_note.domain.use_case

import com.eungb.cleannote.feature_note.domain.model.InvalidNoteException
import com.eungb.cleannote.feature_note.domain.model.Note
import com.eungb.cleannote.feature_note.domain.repository.NoteRepository

class AddNote(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note) {
        // 유효성 검사와 같은 작업을 ViewModel 이 아닌 useCase 에서 작업
        if (note.title.isBlank()) {
            throw InvalidNoteException("제목을 입력해주세요.")
        }
        if (note.content.isBlank()) {
            throw InvalidNoteException("내용을 입력해주세요.")
        }

        repository.insertNote(note)
    }
}