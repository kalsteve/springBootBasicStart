package com.board.back.service.Post;

import com.board.back.domain.post.Post;
import com.board.back.repository.comment.CommentRepository;
import com.board.back.repository.member.MemberRepository;
import com.board.back.repository.post.PostRepository;
import com.board.back.service.member.MemberService;

import java.util.List;
import java.util.Optional;

public class PostServiceImp implements PostService {
    private final PostRepository postRepository;

    public PostServiceImp(PostRepository postRepository) {
        this.postRepository = postRepository;
    }


    @Override
    public void create(Post post) {
        postRepository.save(post);
    }

    @Override
    public Optional<Post> searchById(Long postId) {
        return postRepository.findByPostId(postId);
    }

    @Override
    public List<Post> searchByMemberId(Long memberId) {
        return postRepository.findByMemberId(memberId);
    }

    @Override
    public List<Post> searchByTitle(String title) {
        return postRepository.findByTitle(title);
    }

    @Override
    public void update(Post post) {
        postRepository.update(post);
    }

    @Override
    public void delete(Post post) {
        postRepository.delete(post);
    }

    @Override
    public void deleteById(Long postId) {
        postRepository.deleteByPostId(postId);
    }

    @Override
    public void deleteByMemberId(Long memberId) {
        postRepository.deleteByMemberId(memberId);
    }
}
