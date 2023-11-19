package com.board.back;

import com.board.back.domain.member.Member;
import com.board.back.repository.comment.CommentRepository;
import com.board.back.repository.member.MemberRepository;
import com.board.back.repository.member.MemoryMemberRepository;
import com.board.back.repository.post.PostRepository;
import com.board.back.service.Post.PostService;
import com.board.back.service.comment.CommentService;
import com.board.back.service.member.MemberService;
import com.board.back.service.member.MemberServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public CommentService commentService() {
        return new
    }

    @Bean
    public PostService postService() {
        return new
    }

    @Bean
    public MemberService memberService() {
        return new MemberServiceImp(memberRepository());
    }

    @Bean
    public CommentService commentService() {
        return CommentServiceImp(commentRepository());
    }

}
