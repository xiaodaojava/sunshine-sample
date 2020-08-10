package red.lixiang.test;

import red.lixiang.tools.common.mybatis.model.SqlField;

/**
 * @author lixiang
 * @date 2020/8/9
 **/
public class Users {
    @SqlField
    private Long id;
    @SqlField
    private String name;

    public Long getId() {
        return id;
    }

    public Users setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Users setName(String name) {
        this.name = name;
        return this;
    }
}
