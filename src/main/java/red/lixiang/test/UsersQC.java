package red.lixiang.test;

import red.lixiang.tools.common.mybatis.model.BaseQC;
import red.lixiang.tools.common.mybatis.model.QC;
import red.lixiang.tools.common.mybatis.model.SqlField;

/**
 * @author lixiang
 * @date 2020/8/9
 **/
public class UsersQC extends BaseQC {

    private Long id;

    @QC(likeQuery = true)
    private String name;

    public Long getId() {
        return id;
    }

    public UsersQC setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UsersQC setName(String name) {
        this.name = name;
        return this;
    }
}
