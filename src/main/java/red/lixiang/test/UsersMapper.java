package red.lixiang.test;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import red.lixiang.tools.common.mybatis.BaseMapper;
import red.lixiang.tools.common.mybatis.MybatisToolCache;

/**
 * @author lixiang
 * @date 2020/8/9
 **/
@Mapper
@Repository
public interface UsersMapper extends BaseMapper<Users> {

    @Override
    default Class<?> getMapperClass() {
        MybatisToolCache.cacheDomain("users",Users.class,UsersQC.class);

        return UsersMapper.class;
    }
}
