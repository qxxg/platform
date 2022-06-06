package com.platform.cloud.mbg.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class PmsProductAttribute implements Serializable {
    private Long id;

    private Long productAttributeCategoryId;

    private String name;

    /** 属性选择类型：0->唯一；1->单选；2->多选 **/
    private Integer selectType;

    /** 属性录入方式：0->手工录入；1->从列表中选取 **/
    private Integer inputType;

    /** 可选值列表，以逗号隔开 **/
    private String inputList;

    /** 排序字段：最高的可以单独上传图片 **/
    private Integer sort;

    /** 分类筛选样式：1->普通；1->颜色 **/
    private Integer filterType;

    /** 检索类型；0->不需要进行检索；1->关键字检索；2->范围检索 **/
    private Integer searchType;

    /** 相同属性产品是否关联；0->不关联；1->关联 **/
    private Integer relatedStatus;

    /** 是否支持手动新增；0->不支持；1->支持 **/
    private Integer handAddStatus;

    /** 属性的类型；0->规格；1->参数 **/
    private Integer type;

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productAttributeCategoryId=").append(productAttributeCategoryId);
        sb.append(", name=").append(name);
        sb.append(", selectType=").append(selectType);
        sb.append(", inputType=").append(inputType);
        sb.append(", inputList=").append(inputList);
        sb.append(", sort=").append(sort);
        sb.append(", filterType=").append(filterType);
        sb.append(", searchType=").append(searchType);
        sb.append(", relatedStatus=").append(relatedStatus);
        sb.append(", handAddStatus=").append(handAddStatus);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}