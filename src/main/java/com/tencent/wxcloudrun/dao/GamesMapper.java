package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Games;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author author
 * @since 2022-07-04
 */
public interface GamesMapper  {
    Games getGame(@Param("id") String id);
    List<Games> getGameByCondition(@Param("title") String title, @Param("day") LocalDate day);
    Games createGame(@Param("games") Games games);
}
