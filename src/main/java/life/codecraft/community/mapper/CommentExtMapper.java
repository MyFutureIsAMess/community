package life.codecraft.community.mapper;

import life.codecraft.community.model.Comment;
import life.codecraft.community.model.CommentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}