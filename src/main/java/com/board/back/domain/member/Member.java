package com.board.back.domain.member;

/**
 * 회원
 */
public class Member {
    private  Long memberId;
    private String nickname;
    private String email;
    private String password;

    /**
     * 생성자 주입
     * @param memberId
     * @param nickname
     * @param email
     * @param password
     */
    public Member(Long memberId, String nickname, String email, String password) {
        this.memberId = memberId;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }

    /**
     * Getter & Setter, principle in java
     */

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
}
