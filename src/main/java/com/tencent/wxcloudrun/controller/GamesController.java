package com.tencent.wxcloudrun.controller;


import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.dto.GamesRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.model.Games;
import com.tencent.wxcloudrun.service.CounterService;
import com.tencent.wxcloudrun.service.IGamesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2022-07-04
 */
@RestController
public class GamesController {
    final Logger logger;
    final IGamesService gamesService;
    public GamesController(@Autowired IGamesService gamesService) {
        this.gamesService = gamesService;
        this.logger = LoggerFactory.getLogger(GamesController.class);
    }
    @PostMapping(value = "/api/game")
    ApiResponse get(@RequestBody GamesRequest request) {
        logger.info("/api/count get request");
        String id = request.getId();
        Optional<Games> game = gamesService.getGame(id);
        return ApiResponse.ok(game);
    }
    @PostMapping(value = "/api/gameByCondition")
    ApiResponse getByCondition(@RequestBody GamesRequest request) {
        logger.info("/api/count get request");
        LocalDate day = request.getDay();
        String SearchText = request.getSearchText();
        List<Games> game = gamesService.getGameByCondition(SearchText,day);
        return ApiResponse.ok(game);
    }
    //增加game
    @PostMapping(value = "/api/createGame")
    ApiResponse createGame(@RequestBody GamesRequest request) {
        logger.info("/api/count get request");
        Games requestGames = request.getGames();

        Games games = new Games();
        games = requestGames;
        Games game = gamesService.createGame(games);
        return ApiResponse.ok(game);
    }
}
