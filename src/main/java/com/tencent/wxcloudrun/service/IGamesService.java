package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Games;

import java.util.Optional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author author
 * @since 2022-07-04
 */
public interface IGamesService {
    Optional<Games> getGame(String id);

}
