package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.CountersMapper;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.dao.GamesMapper;
import com.tencent.wxcloudrun.model.Games;
import com.tencent.wxcloudrun.service.IGamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2022-07-04
 */
@Service
public class GamesServiceImpl implements IGamesService {
    final GamesMapper gamesMapper;

    public GamesServiceImpl(@Autowired GamesMapper gamesMapper) {
        this.gamesMapper = gamesMapper;
    }

    @Override
    public Optional<Games> getGame(String id) {
        return Optional.ofNullable(gamesMapper.getGame(id));

    }
}
