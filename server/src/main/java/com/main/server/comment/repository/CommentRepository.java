package com.main.server.comment.repository;

import com.main.server.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment,Long> {


        Optional<Comment> findByCommentId(Long commentId);
}
