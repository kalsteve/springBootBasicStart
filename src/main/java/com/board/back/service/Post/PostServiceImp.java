package com.board.back.service.Post;

import com.board.back.domain.post.Post;
import com.board.back.repository.comment.CommentRepository;
import com.board.back.repository.member.MemberRepository;
import com.board.back.repository.post.PostRepository;
import com.board.back.service.member.MemberService;

public class PostServiceImp implements PostService {

    private final MemberRepository memberRepository;
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public PostServiceImp(MemberRepository memberRepository, PostRepository postRepository, CommentRepository commentRepository) {
        this.memberRepository = memberRepository;
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    @Override
    public void writePost(Post post) {

    }

    @Override
    public void readPost(Post post) {

    }

    @Override
    public void updatePost(Post post) {

    }

    @Override
    public void deletePost(Post post) {

    }
}
