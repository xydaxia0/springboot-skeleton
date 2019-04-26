package com.yaojiafeng.springboot.skeleton.common.domain;

import java.io.Serializable;

/**
 * Created by yaojiafeng on 2019/4/26 10:38 AM.
 */
public class RpcResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String SUCCESS = "200";
    public static final String INVALID_PARAMS = "400";
    public static final String FAIL = "500";
    public static final String BUSINESS_ERROR = "600";
    private String message = "";
    private String code = "";
    private T data;
    private Long pageNo;
    private Long pageSize;
    private Long totalCount;
    private Long totalPage;

    public RpcResult() {
    }

    public RpcResult data(T data) {
        this.data = data;
        return this;
    }

    public RpcResult msg(String message) {
        this.message = message;
        return this;
    }

    public RpcResult code(String code) {
        this.code = code;
        return this;
    }

    public RpcResult success() {
        return this.success("200");
    }

    public RpcResult success(String code) {
        this.code = code;
        return this;
    }

    public RpcResult fail() {
        return this.fail("500");
    }

    public RpcResult fail(String code) {
        this.code = code;
        return this;
    }

    public boolean isSuccess() {
        return "200".equals(this.getCode());
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalPage() {
        return this.totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }
}
