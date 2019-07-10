package com.wangcf.cloud.repository;

import com.wangcf.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: wangcf
 * @Date: 2019/7/10 22:46
 * @Description ${description}
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
