package com.fastcampus.projectboard.domain.dto.request;

import com.fastcampus.projectboard.domain.dto.ArticleDto;
import com.fastcampus.projectboard.domain.dto.HashtagDto;
import com.fastcampus.projectboard.domain.dto.UserAccountDto;

import java.util.Set;

public record ArticleRequest(
        String title,
        String content
) {

    public static ArticleRequest of(String title, String content) {
        return new ArticleRequest(title, content);
    }

    public ArticleDto toDto(UserAccountDto userAccountDto) {
        return toDto(userAccountDto, null);
    }

    public ArticleDto toDto(UserAccountDto userAccountDto, Set<HashtagDto> hashtagDtos) {
        return ArticleDto.of(
                userAccountDto,
                title,
                content,
                hashtagDtos
        );
    }
}
