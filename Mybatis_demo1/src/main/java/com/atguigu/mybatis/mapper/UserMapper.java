package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    void updateUser();

    /**
     * 删除用户
     */
    void deleteUser();

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();

    /**
     * 通过用户名查找用户
     * @return
     */
    User findUserByName(String username, String password);

    /**
     * 实体类参数添加用户
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 通过注解传递参数
     * @param username
     * @param password
     * @return
     */
    User findUser(@Param("username") String username, @Param("password") String password);

    Map<String,Object> findUserMap(@Param("username") String username, @Param("password") String password);

    List<Map<String,Object>> findUserMapList();

    List<User> selectUserLike(@Param("username") String username);

    void delete(@Param("ids") String ids);


}
