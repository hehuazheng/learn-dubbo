package study.learn.dao.mapper;

import java.util.List;
import study.learn.dao.model.Tb1;
import study.learn.dao.model.Tb1Example;

public interface Tb1Mapper {
    int deleteByExample(Tb1Example example);

    int insert(Tb1 record);

    int insertSelective(Tb1 record);

    List<Tb1> selectByExample(Tb1Example example);
}