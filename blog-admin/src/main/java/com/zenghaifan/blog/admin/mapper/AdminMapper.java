package com.zenghaifan.blog.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zenghaifan.blog.admin.pojo.Admin;
import com.zenghaifan.blog.admin.pojo.Permission;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AdminMapper extends BaseMapper<Admin> {

    @Select("SELECT * FROM fan_permission where id in (select permission_id from fan_admin_permission where admin_id=#{adminId})")
    List<Permission> findPermissionByAdminId(Long adminId);
}
