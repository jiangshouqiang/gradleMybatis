package com.gr.jiang.mapper;

import com.gr.jiang.domain.ScrapyContent;

public interface ScrapyContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCRAPY_CONTENT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long contentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCRAPY_CONTENT
     *
     * @mbggenerated
     */
    int insert(ScrapyContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCRAPY_CONTENT
     *
     * @mbggenerated
     */
    int insertSelective(ScrapyContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCRAPY_CONTENT
     *
     * @mbggenerated
     */
    ScrapyContent selectByPrimaryKey(Long contentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCRAPY_CONTENT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ScrapyContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SCRAPY_CONTENT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ScrapyContent record);
}