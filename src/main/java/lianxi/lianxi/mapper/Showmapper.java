package lianxi.lianxi.mapper;

import lianxi.lianxi.entity.name;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Showmapper {

    @Select("select * from cnm")
    List<name> show();

}
