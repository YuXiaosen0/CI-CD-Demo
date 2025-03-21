package org.example.common.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 封装分页查询结果
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {
    private long total; //总记录数
    private List<T> records; //当前页数据集合
}

