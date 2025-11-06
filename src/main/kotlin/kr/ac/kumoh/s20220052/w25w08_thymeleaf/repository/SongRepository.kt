package kr.ac.kumoh.s20220052.w25w08_thymeleaf.repository

import kr.ac.kumoh.s20220052.w25w08_thymeleaf.model.Song
import org.springframework.stereotype.Repository

@Repository
class SongRepository {
    private val songs = listOf(
        Song(1,"Golden","HUNTR/X"),
        Song(2,"Soda Pop","Saja boys"),
        Song(3,"걘 아니야.pt1","지코"),
    )

    fun findAll() = songs.toList()

    fun findById(Id: Int): Song? {
        return songs.find { it.id == id }
    }

    fun count() = songs.size
}