package com.zenghaifan.domain.VO;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserInfoVo {

    private Long id;

    private String nickName;

    private String avatar;

    private String sex;

    private String email;
}
