package life.codecraft.community.mapper;

import life.codecraft.community.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);

    int incCommentCount(Question record);
}