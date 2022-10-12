package com.mega.book.springboot.web.dto;

import com.mega.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter //자동으로 겟 생성 해줌
public class PostsResponseDto {
    private Long id; //필드 변수선언
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){ //생성자
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

}
