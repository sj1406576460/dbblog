package cn.dblearn.blog.mapper.article;

import cn.dblearn.blog.entity.article.Article;
import cn.dblearn.blog.entity.article.vo.ArticleVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 文章 Mapper 接口
 * </p>
 *
 * @author bobbi
 * @since 2018-11-07
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {


    /**
     * 查询列表
     *
     * @param page
     * @param params
     * @return
     */
    List<ArticleVo> listArticleVo(Page<ArticleVo> page, @Param("article") Map<String, Object> params);
}