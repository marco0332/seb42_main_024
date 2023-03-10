package com.main.server.comment.entity;

import com.main.server.board.entity.Board;
import com.main.server.member.entity.Member;
import com.main.server.playlist.entity.Playlist;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;
    // MEMBER_ID

    @ManyToOne
    @JoinColumn(name = "Board_ID")
    private Board board;
    // Board_ID


    @Column(length = 100,nullable = false, unique = true)
    private String content;
    //length

    /*

    private Boolean isSong;
    // 구상 - 댓글 단 시점 가져와서 선착순으로 정렬, 공간 조금 할애해서 신청곡 리스트 편성.
    */

    public Comment(Member member, Board board, String content) {
        this.member = member;
        this.board = board;
        this.content = content;
    }
}
