package com.tencent.wxcloudrun.dto;

import com.tencent.wxcloudrun.model.Games;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class GamesRequest {

  // `action`：`string` 类型，枚举值
  // 等于 `"inc"` 时，表示计数加一
  // 等于 `"clear"` 时，表示计数重置（清零）
  private String id;
  private String searchText;
  private LocalDate day;
  private Games games;
}
