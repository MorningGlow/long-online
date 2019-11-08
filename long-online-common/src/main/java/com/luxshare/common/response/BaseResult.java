package com.luxshare.common.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/**
 * 通用 api 接口返回类型
 *
 * @author hyl
 * @date 2019-07-02
 */

@ApiModel("前端通用返回实体")
@Getter
@Setter
public class BaseResult<T> implements Serializable {

    private static final String RESULT_OK = "ok";

    private static final String RESULT_NOT_OK = "not_ok";

    private static final String SUCCESS = "成功操作";

    private static final String RESULT_SUCCESS_CODE = "200";

    private static final String RESULT_SERVER_ERROR_CODE = "500";

    private static final String RESULT_SECURITY_FORBIDDEN_CODE = "401";

    @ApiModelProperty(value = "成功返回 ok")
    private String result;

    @ApiModelProperty(value = "状态码")
    private String code;

    @ApiModelProperty(value = "返回数据")
    private T data;

    @ApiModelProperty(value = "返回描述")
    private String success;

    private List<Error> errors;

    public static <T> BaseResult<T> ok() {
        return createResult(RESULT_OK, RESULT_SUCCESS_CODE, null, SUCCESS, null);
    }

    public static <T> BaseResult<T> ok(String success) {
        return createResult(RESULT_OK, RESULT_SUCCESS_CODE, null, success, null);
    }

    public static <T> BaseResult<T> ok(T data) {
        return createResult(RESULT_OK, RESULT_SUCCESS_CODE, data, SUCCESS, null);
    }

    public static <T> BaseResult<T> notOk(List<Error> errors) {
        return createResult(RESULT_NOT_OK, RESULT_SERVER_ERROR_CODE, null, null, errors);
    }

    public static <T> BaseResult<T> notOk(String code, String field, Object error) {
        return createResult(RESULT_NOT_OK, code, null, null, Collections.singletonList(new Error(field, error)));
    }

    public static <T> BaseResult<T> notOk(String field, Object error) {
        return createResult(RESULT_NOT_OK, RESULT_SERVER_ERROR_CODE, null, null, Collections.singletonList(new Error(field, error)));
    }

    /**
     * 创建一个返回结果
     *
     * @param result  结果描述 ok,not_ok
     * @param code    结果描述 401,500,200
     * @param data    返回数据
     * @param success 成功描述 成功操作
     * @param errors  错误信息
     * @return BaseResult result
     */
    private static <T> BaseResult<T> createResult(String result, String code, T data, String success, List<Error> errors) {
        BaseResult baseResult = new BaseResult();
        baseResult.setResult(result);
        baseResult.setData(data);
        baseResult.setCode(code);
        baseResult.setSuccess(success);
        baseResult.setErrors(errors);

        return baseResult;
    }


    @ApiModel("错误信息")
    @Getter
    @Setter
    @Accessors(chain = true)
    @AllArgsConstructor
    public static class Error {

        @ApiModelProperty(value = "一般是实体中字段")
        private String field;

        @ApiModelProperty(value = "错误描述信息")
        private Object message;
    }
}
