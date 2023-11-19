package com.board.back.service.comment;

import com.board.back.domain.post.comment.Comment;
import com.board.back.repository.comment.CommentRepository;
import com.board.back.repository.member.MemberRepository;
import com.board.back.repository.post.PostRepository;

public class CommentServiceImp implements CommentService {

    private final MemberRepository memberRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public CommentServiceImp(MemberRepository memberRepository, PostRepository postRepository, CommentRepository commentRepository) {
        this.memberRepository = memberRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public void writeComment(Comment comment) {

    }

    @Override
    public void updateComment(Comment comment) {

    }

    @Override
    public void deleteComment(Comment comment) {

    }

    @Override
    public void readComment(Comment comment) {

    }

    @Override
    public void readCommentList(Comment comment) {

    }
}
