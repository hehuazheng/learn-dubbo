package study.learn.dao.mapper;

import java.util.List;
import study.learn.dao.model.Tb2;
import study.learn.dao.model.Tb2Example;

public interface Tb2Mapper {
    int deleteByExample(Tb2Example example);

    int insert(Tb2 record);

    int insertSelective(Tb2 record);

    List<Tb2> selectByExample(Tb2Example example);
}