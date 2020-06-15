package com.hua.shi.lufudao;

import com.hua.shi.entity.TAccount;
import com.hua.shi.entity.TAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TAccountMapper extends Mapper<TAccount> {
    long countByExample(TAccountExample example);

    int deleteByExample(TAccountExample example);

    List<TAccount> selectByExample(TAccountExample example);

    int updateByExampleSelective(@Param("record") TAccount record, @Param("example") TAccountExample example);

    int updateByExample(@Param("record") TAccount record, @Param("example") TAccountExample example);
}